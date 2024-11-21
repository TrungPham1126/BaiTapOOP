package Product;

public class Main {
	public static void main(String[] args) {

		Product projector = new Product("Projector", "Máy chiếu", "Epson", 3000.00, "Electronics");
		Product camera = new Product("Camera", "Camera an ninh", "Sony", 1500.00, "Electronics");
		Product washingMachine = new Product("Washing Machine", "Máy giặt gia đình", "LG", 800.00, "Home Appliances");
		Product shoes = new Product("Shoes", "Giầy dép cá nhân", "Nike", 100.00, "Personal Items");

		Product[] products = { projector, camera, washingMachine, shoes };

		String nameToSearch = "Camera";
		System.out.println("Tìm kiếm sản phẩm có tên " + nameToSearch + ":");
		for (Product p : products) {
			if (p.matchesName(nameToSearch)) {
				System.out.println(p);
			}
		}

		String categoryToSearch = "Electronics";
		System.out.println("\nTìm kiếm sản phẩm trong loại " + categoryToSearch + ":");
		for (Product p : products) {
			if (p.matchesCategory(categoryToSearch)) {
				System.out.println(p);
			}
		}

		double minPrice = 100.00;
		double maxPrice = 2000.00;
		System.out.println("\nTìm kiếm sản phẩm trong khoảng giá từ " + minPrice + " đến " + maxPrice + ":");
		for (Product p : products) {
			if (p.matchesPrice(minPrice, maxPrice)) {
				System.out.println(p);
			}
		}
	}
}
