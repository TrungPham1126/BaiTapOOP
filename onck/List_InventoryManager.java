package de2;

import java.util.ArrayList;

public class List_InventoryManager implements InventoryManager {
	protected ArrayList<Electronics> list;

	public List_InventoryManager() {
		this.list = new ArrayList<Electronics>();
	}

	public List_InventoryManager(ArrayList<Electronics> list) {
		super();
		this.list = list;
	}

	@Override
	public void addProduct(Electronics p) {
		if (p == null) {
			throw new IllegalArgumentException("Nhan vien khong hop le!");
		}
		list.add(p);
	}

	@Override
	public void editProduct(Electronics p) {
		for (Electronics electronics : list) {
			if (p == null) {
				throw new IllegalArgumentException("du lieu ko hop le");
			}

			if (electronics.getProduct_name().equalsIgnoreCase(p.getProduct_name())) {
				electronics.setProduct_id(p.getProduct_id());
				electronics.setProduct_name(p.getProduct_name());
				electronics.setProduct_price(p.getProduct_price());
				electronics.setProduct_quantity(p.getProduct_quantity());
			}
		}
	}

	@Override
	public Electronics searchProduct(String productName) {
		for (Electronics electronics : list) {
			if (electronics.getProduct_name().equalsIgnoreCase(productName)) {
				return electronics;
			}
		}
		System.out.println("Không tìm thấy sản phẩm: " + productName);
		return null;
	}

	@Override
	public void getTotalInventoryValue() {
		// TODO Auto-generated method stub

	}
}
