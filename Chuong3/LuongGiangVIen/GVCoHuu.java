package LuongGiangVIen;

import java.util.Scanner;

public class GVCoHuu extends GiangVien {
	protected double LCB;
	protected double HSL;
	protected int NCT;

	public GVCoHuu() {
		super();
	}

	public GVCoHuu(String hoTen, String diaChi, String loaiGiangVIen, double LCB, double HSL, int NCT) {
		super(hoTen, diaChi, loaiGiangVIen);
		this.LCB = LCB;
		this.HSL = HSL;
		this.NCT = NCT;
	}

	void nhapThongTin() {
		Scanner scanner = new Scanner(System.in);
		super.nhapThongTin();
		System.out.print("Nhap luong co ban");
		this.LCB = scanner.nextDouble();
		System.out.println("Nhap he so luong");
		this.HSL = scanner.nextInt();
		System.out.println("Nhap nam cong tac");
		this.NCT = scanner.nextInt();
	}

	@Override
	double tinhLuong() {
		double luong = LCB * HSL;

		if (NCT == 5) {
			luong += LCB * 0.05;
		} else if (NCT > 5) {
			luong += LCB * NCT * 0.01;
		}

		return luong;
	}

}
