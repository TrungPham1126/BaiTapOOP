package LuongLaoDong;

class LaoDongPhoThong extends NguoiLaoDong {
	public LaoDongPhoThong(String hoTen, String diaChi, int soNgayCong) {
		super(hoTen, diaChi, soNgayCong);
	}

	public double tinhLuong() {
		double luong = 3000000;
		double thuong = 0;

		if (soNgayCong > 25) {
			thuong = 1000000;
		} else if (soNgayCong > 15) {
			thuong = 700000;
		}
		return luong + thuong;
	}
}
