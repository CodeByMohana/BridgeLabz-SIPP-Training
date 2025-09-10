package sales_dashboard;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;


public class IntelligentSalesDashboard {
    public static void main(String[] args) {
        // ---------------- SAMPLE DATA ----------------
        Item laptop = new Item("Laptop", "Electronics", 1200);
        Item tv = new Item("TV", "Electronics", 900);
        Item treadmill = new Item("Treadmill", "Fitness", 700);
        Item microwave = new Item("Microwave", "Home Appliances", 200);
        Item headphones = new Item("Headphones", "Electronics", 150);
        Item blender = new Item("Blender", "Home Appliances", 80);
        Item toaster = new Item("Toaster", "Home Appliances", 50);
        Item yogaMat = new Item("Yoga Mat", "Fitness", 40);

        Order o1 = new Order(LocalDate.now().minusDays(10), Arrays.asList(laptop, headphones));
        Order o2 = new Order(LocalDate.now().minusDays(20), Arrays.asList(blender));
        Order o3 = new Order(LocalDate.now().minusDays(30), Arrays.asList(yogaMat));
        Order o4 = new Order(LocalDate.now().minusDays(15), Arrays.asList(tv, microwave));
        Order o5 = new Order(LocalDate.now().minusDays(5), Arrays.asList(treadmill, toaster));

        Map<String, List<Order>> store1 = new HashMap<>();
        store1.put("Alice", Arrays.asList(o1, o2, o3)); // 3 recent orders
        store1.put("Bob", Arrays.asList(o4, o5, o3));   // 3 recent orders

        Map<String, List<Map<String, List<Order>>>> cityToStoresMap = new HashMap<>();
        cityToStoresMap.put("New York", Arrays.asList(store1));

        // ---------------- STREAM PIPELINE ----------------
        List<Item> topAffordablePicks = cityToStoresMap.values().stream()
            .flatMap(List::stream)   // list of stores
            .flatMap(store -> store.values().stream()) // customers -> orders
            .filter(orders -> {
                // Step 2: customers with at least 3 orders in last 60 days
                LocalDate sixtyDaysAgo = LocalDate.now().minusDays(60);
                long recentOrders = orders.stream()
                        .filter(o -> o.getOrderDate().isAfter(sixtyDaysAgo))
                        .count();
                return recentOrders >= 3;
            })
            // Step 3: Map to customer’s items
            .flatMap(orders -> orders.stream().flatMap(o -> o.getItems().stream()))
            // Step 5: Distinct by item name
            .collect(Collectors.toMap(Item::getName, i -> i, (i1, i2) -> i1))
            .values().stream()
            // Step 6: Sort descending by price
            .sorted(Comparator.comparingDouble(Item::getPrice).reversed())
            // Step 7: Log items
            .peek(i -> System.out.println("Item: " + i.getName() + ", $" + i.getPrice()))
            // Step 8: Skip top 2 expensive, limit 10
            .skip(2).limit(10)
            .collect(Collectors.toList());

        // Step 9: Group by category
        Map<String, List<Item>> itemsByCategory = topAffordablePicks.stream()
                .collect(Collectors.groupingBy(Item::getCategory));

        // Step 10: Count Electronics
        long electronicsCount = itemsByCategory.getOrDefault("Electronics", List.of()).size();

        // Step 11: anyMatch > $500
        boolean anyOver500 = topAffordablePicks.stream().anyMatch(i -> i.getPrice() > 500);

        // Step 12: allMatch > $10
        boolean allAbove10 = topAffordablePicks.stream().allMatch(i -> i.getPrice() > 10);

        // Step 13: noneMatch null/empty names
        boolean noEmptyNames = topAffordablePicks.stream()
                .noneMatch(i -> i.getName() == null || i.getName().isBlank());

        // Step 14: findFirst Home Appliances
        Optional<Item> firstHomeAppliance = itemsByCategory
                .getOrDefault("Home Appliances", List.of()).stream().findFirst();

        // Step 15: findAny Fitness item
        Optional<Item> anyFitness = itemsByCategory
                .getOrDefault("Fitness", List.of()).stream().findAny();

        // Step 16: reduce total value
        double totalValue = topAffordablePicks.stream()
                .map(Item::getPrice)
                .reduce(0.0, Double::sum);

        // ---------------- OUTPUT ----------------
        System.out.println("\n=== Dashboard Insights ===");
        System.out.println("Items by Category: " + itemsByCategory);
        System.out.println("Electronics Count: " + electronicsCount);
        System.out.println("Any item > $500? " + anyOver500);
        System.out.println("All items > $10? " + allAbove10);
        System.out.println("No empty names? " + noEmptyNames);
        System.out.println("First Home Appliance: " + firstHomeAppliance);
        System.out.println("Any Fitness item: " + anyFitness);
        System.out.println("Total Value: $" + totalValue);
    }
}