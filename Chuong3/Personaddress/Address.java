package Personaddress;

public class Address {
	private String thon;
	private String xa;
	private String huyen;
	private String tinh;

	public Address() {
	}

	public Address(String thon, String xa, String huyen, String tinh) {
		this.thon = thon;
		this.xa = xa;
		this.huyen = huyen;
		this.tinh = tinh;
	}

	public String getThon() {
		return thon;
	}

	public void setThon(String thon) {
		this.thon = thon;
	}

	public String getXa() {
		return xa;
	}

	public void setXa(String xa) {
		this.xa = xa;
	}

	public String getHuyen() {
		return huyen;
	}

	public void setHuyen(String huyen) {
		this.huyen = huyen;
	}

	public String getTinh() {
		return tinh;
	}

	public void setTinh(String tinh) {
		this.tinh = tinh;
	}

	public String toString() {
		return " Thon " + thon + " xa " + xa + " huyen " + huyen + " tinh " + tinh;
	}
}
