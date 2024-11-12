package LuongGiangVIen;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<GiangVien> dSGV = new ArrayList<>();
		while (true) {
			try {
				System.out.print("Nhập vào số giảng viên: ");
				int n = sc.nextInt();
				sc.nextLine();
				if (n <= 0) {
					System.out.println("Số lượng giảng viên phải lớn hơn 0. Vui lòng nhập lại.");
					continue;
				}
				for (int i = 0; i < n; i++) {
					System.out.println("Nhập thông tin giảng viên thứ " + (i + 1) + ":");
					GiangVien gv;
					System.out.print("Nhập loại giảng viên (1: Chính thức, 2: Thỉnh giảng): ");
					int type = sc.nextInt();
					sc.nextLine();

					if (type == 1) {
						gv = new GVCoHuu();
					} else {
						gv = new GVThinhGiang();
					}
					gv.nhapThongTin();
					dSGV.add(gv);
				}
				break;

			} catch (Exception e) {
				System.out.println("Lỗi! Yêu cầu nhập lại.");
				sc.nextLine();
			}
		}
		while (true) {
			System.out.println("Chọn hành động:");
			System.out.println("1. Sắp xếp giảng viên theo tên");
			System.out.println("2. Tìm kiếm giảng viên theo tên");
			System.out.println("3. In thông tin giảng viên");
			System.out.println("4. Thoát");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				dSGV.sort((gv1, gv2) -> gv1.hoTen.compareTo(gv2.hoTen));
				// tên
				System.out.println("Dnh sách giảng viên sau khi sắp xếp:");
				for (GiangVien gv : dSGV) {
					System.out.println(gv.inThongTin() + " Lương: " + gv.tinhLuong());
				}
				break;

			case 2:
				System.out.print("Nhập tên giảng viên cần tìm: ");
				String searchName = sc.nextLine();
				boolean found = false;
				for (GiangVien gv : dSGV) {
					if (gv.hoTen.equalsIgnoreCase(searchName)) {
						System.out.println("Giảng viên tìm thấy: " + gv.inThongTin() + " Lương: " + gv.tinhLuong());
						found = true;
						break;
					}
				}
				if (!found) {
					System.out.println("Không tìm thấy giảng viên có tên: " + searchName);
				}
				break;

			case 3:
				System.out.println("Danh sách giảng viên:");
				for (GiangVien gv : dSGV) {
					System.out.println(gv.inThongTin() + " Lương: " + gv.tinhLuong());
				}
				break;

			case 4:
				System.out.println("Thoát chương trình.");
				return;

			default:
				System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
			}
		}
	}
}
