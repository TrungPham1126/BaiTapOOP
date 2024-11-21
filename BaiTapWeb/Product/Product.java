package Product;

class Product {
	private String name;
	private String description;
	private String manufacturer;
	private double price;
	private String category;

	public Product(String name, String description, String manufacturer, double price, String category) {
		this.name = name;
		this.description = description;
		this.manufacturer = manufacturer;
		this.price = price;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public double getPrice() {
		return price;
	}

	public String getCategory() {
		return category;
	}

	public boolean matchesName(String searchName) {
		return name.equalsIgnoreCase(searchName);
	}

	public boolean matchesCategory(String searchCategory) {
		return category.equalsIgnoreCase(searchCategory);
	}

	public boolean matchesPrice(double minPrice, double maxPrice) {
		return price >= minPrice && price <= maxPrice;
	}

	@Override
	public String toString() {
		return "Product{name='" + name + "', description='" + description + "', manufacturer='" + manufacturer
				+ "', price=" + price + ", category='" + category + "'}";
	}
}
