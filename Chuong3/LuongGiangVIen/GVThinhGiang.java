package LuongGiangVIen;

import java.util.Scanner;

public class GVThinhGiang extends GiangVien {
	protected int STD;
	protected double DG;

	public GVThinhGiang() {

	}

	public GVThinhGiang(String hoTen, String diaChi, String loaiGiangVIen, int STD, double DG) {
		super(hoTen, diaChi, loaiGiangVIen);
		this.STD = STD;
		this.DG = DG;
	}

	void nhapThongTin() {
		Scanner scanner = new Scanner(System.in);
		super.nhapThongTin();
		System.out.println("Nhap so tiet day ");
		this.STD = scanner.nextInt();
		System.out.println("Nhap don gia");
		this.DG = scanner.nextInt();
	}

	@Override
	double tinhLuong() {
		return STD * DG - 0.15 * STD * DG;
	}

}
