package de2;

public class test {
	public static void main(String[] args) {
		InventoryManager sv = new List_InventoryManager();
		Electronics a = new Electronics("434", "trung", 5, 45, 54, "454");
		Electronics b = new Electronics("435", "trung", 5, 45, 54, "454");
		Electronics c = new Electronics("436", "trung", 5, 45, 54, "454");
		sv.addProduct(a);
		sv.addProduct(b);
		sv.addProduct(c);
		sv.editProduct(c);
		try {
			Electronics result = sv.searchProduct("trund");
			System.out.println("Sản phẩm tìm thấy: " + result);
		} catch (IllegalArgumentException e) {
			System.out.println("Lỗi: " + e.getMessage());
		}

	}

}
