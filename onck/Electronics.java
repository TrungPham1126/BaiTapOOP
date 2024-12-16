package de2;

public class Electronics extends Product {
	protected int warranty_period;

	protected String brand;

	public Electronics() {
		super();
	}

	public Electronics(String product_id, String product_name, double product_price, int product_quantity,
			int warranty_period, String brand) {
		super(product_id, product_name, product_price, product_quantity);
		this.warranty_period = warranty_period;
		this.brand = brand;
	}

	public double getTotalValue() {

		return warranty_period;

	}

	public int getWarranty_period() {
		return warranty_period;
	}

	public void setWarranty_period(int warranty_period) {
		this.warranty_period = warranty_period;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return super.toString() + " Electronics [warranty_period=" + warranty_period + ", brand=" + brand + "]";
	}

}
