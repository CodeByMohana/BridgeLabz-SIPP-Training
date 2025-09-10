package sales_dashboard;

import java.time.LocalDate;
import java.util.List;

class Order {
	LocalDate orderDate;
	List<Item> items;

	public Order(LocalDate orderDate, List<Item> items) {
		this.orderDate = orderDate;
		this.items = items;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public List<Item> getItems() {
		return items;
	}

	@Override
	public String toString() {
		return "Order{" + orderDate + ", items=" + items + "}";
	}

}
