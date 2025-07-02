package encapsulation_polymorphism_interface_and_abstractclass.e_commerce;

public class Electronics extends Product implements ITaxable {

	public Electronics(int productId, String name, double price) {
		super(productId, name, price);
	}
	
	@Override
	public double calculateDiscount() {
		return getPrice() * 0.10; // 10% discount
	}
	
	@Override
    public double calculateTax() {
        return getPrice() * 0.18; // 18% GST
    }

    @Override
    public String getTaxDetails() {
        return "18% GST applied on Electronics.";
    }
}
