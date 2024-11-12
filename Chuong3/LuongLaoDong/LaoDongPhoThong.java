package LuongLaoDong;

abstract class NguoiLaoDong {
	protected String hoTen;
	protected String diaChi;
	protected int soNgayCong;

	public NguoiLaoDong(String hoTen, String diaChi, int soNgayCong) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.soNgayCong = soNgayCong;
	}

	public void nhapThongTin() {
	}

	public abstract double tinhLuong();

	public void inThongTin() {
		System.out.println("Họ tên: " + hoTen);
		System.out.println("Địa chỉ: " + diaChi);
		System.out.println("Số ngày công: " + soNgayCong);
		System.out.println("Lương: " + tinhLuong());
	}
}