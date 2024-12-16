package de2;

public interface InventoryManager {
	void addProduct(Electronics p);

	void editProduct(Electronics p);

	Electronics searchProduct(String productName);

	void getTotalInventoryValue();

}
