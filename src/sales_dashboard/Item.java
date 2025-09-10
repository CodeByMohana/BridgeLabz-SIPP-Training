package sales_dashboard;

class Item {
	String name;
	String category;
	double price;

	public Item(String name, String category, double price) {
		super();
		this.name = name;
		this.category = category;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return name + "($" + price + ")";
	}
}