package ThuHocPhi;

import java.util.Scanner;

public class HocVien {
	protected String hoTen;
	protected String diaChi;
	protected int loaiChuongTrinh;
	protected int uuTien;

	public void nhapThongTin() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập họ tên: ");
		hoTen = scanner.nextLine();
		System.out.print("Nhập địa chỉ: ");
		diaChi = scanner.nextLine();
		System.out.print("Nhập loại chương trình (1 hoặc 2): ");
		loaiChuongTrinh = scanner.nextInt();
		System.out.print("Nhập loại ưu tiên (1 hoặc 2): ");
		uuTien = scanner.nextInt();
	}

	public int hocPhi() {
		int baseFee = (loaiChuongTrinh == 1) ? 1000000 : 800000;
		return baseFee + (uuTien == 1 ? 1000000 : 800000);
	}

	public void inThongTin() {
		System.out.println("Họ tên: " + hoTen);
		System.out.println("Địa chỉ: " + diaChi);
		System.out.println("Loại chương trình: " + loaiChuongTrinh);
		System.out.println("Loại ưu tiên: " + uuTien);
		System.out.println("Học phí: " + hocPhi());
	}
}
