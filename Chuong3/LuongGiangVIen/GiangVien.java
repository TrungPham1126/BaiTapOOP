package LuongGiangVIen;

import java.util.Scanner;

public abstract class GiangVien {
	protected String hoTen;
	protected String diaChi;
	protected String loaiGiangVIen;

	public GiangVien() {
	};

	public GiangVien(String hoTen, String diaChi, String loaiGiangVIen) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiGiangVIen = loaiGiangVIen;
	}

	void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten gv");
		this.hoTen = sc.nextLine();
		System.out.println("Nhap dia chi");
		this.diaChi = sc.nextLine();
		System.out.println("nhap loai Gv");
		this.loaiGiangVIen = sc.nextLine();
	}

	abstract double tinhLuong();

	public String inThongTin() {
		return hoTen + " " + diaChi + " " + loaiGiangVIen + " ";
	}

}
