package SinhVienKThua;

public class Truong {
	String ten;
	String diaChi;
	String hieuTruong;

	public Truong() {
	}

	public Truong(String ten, String diaChi, String hieuTruong) {
		this.ten = ten;
		this.diaChi = diaChi;
		this.hieuTruong = hieuTruong;

	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getTen() {
		return ten;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getHieuTruong() {
		return hieuTruong;
	}

	public void setHieuTruong(String hieuTruong) {
		this.hieuTruong = hieuTruong;
	}

	public String toString() {
		return " ten truong: " + ten + " dia chi: " + diaChi + " hieu truong: " + hieuTruong;
	}
}