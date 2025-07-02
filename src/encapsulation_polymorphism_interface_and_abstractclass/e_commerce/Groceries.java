package encapsulation_polymorphism_interface_and_abstractclass.e_commerce;

public class Groceries extends Product {

    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }

    // No tax, so not implementing Taxable
}