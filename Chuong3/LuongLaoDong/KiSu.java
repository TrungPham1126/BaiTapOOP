package LuongLaoDong;

class KiSu extends NguoiLaoDong {
	private double heSoLuong;
	private double luongCoBan;

	public KiSu(String hoTen, String diaChi, int soNgayCong, double heSoLuong, double luongCoBan) {
		super(hoTen, diaChi, soNgayCong);
		this.heSoLuong = heSoLuong;
		this.luongCoBan = luongCoBan;
	}

	public double tinhLuong() {
		double thuong = 0;

		if (soNgayCong > 25) {
			thuong = 2000000;
		} else if (soNgayCong > 15) {
			thuong = 1000000;
		} else {
			thuong = 500000;
		}

		return luongCoBan * heSoLuong + thuong;
	}
}
