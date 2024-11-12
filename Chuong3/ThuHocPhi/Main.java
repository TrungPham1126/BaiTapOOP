package ThuHocPhi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		QuanLyHocVien quanLyHocVien = new QuanLyHocVien();
		Scanner scanner = new Scanner(System.in);
		int choice;

		do {
			System.out.println("\n--- Quản lý học viên ---");
			System.out.println("1. Thêm học viên đại học");
			System.out.println("2. Thêm học viên luyện thi");
			System.out.println("3. Tìm kiếm học viên");
			System.out.println("4. Sắp xếp danh sách học viên theo tên");
			System.out.println("0. Thoát");
			System.out.print("Chọn chức năng: ");

			try {
				choice = scanner.nextInt();
				scanner.nextLine();

				switch (choice) {
				case 1:
					HocVien hocvienDH = new HocvienDH();
					quanLyHocVien.themHocVien(hocvienDH);
					break;
				case 2:
					HocVien hocvienLT = new HocvienLT();
					quanLyHocVien.themHocVien(hocvienLT);
					break;
				case 3:
					System.out.print("Nhập tên học viên cần tìm: ");
					String tenHocVien = scanner.nextLine();
					quanLyHocVien.timKiemHocVien(tenHocVien);
					break;
				case 4:
					quanLyHocVien.sapXepHocVien();
					break;
				case 0:
					System.out.println("Thoát chương trình.");
					break;
				default:
					System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
				}
			} catch (InputMismatchException e) {
				System.out.println("Lỗi: Nhập sai định dạng. Vui lòng nhập số.");
				scanner.next();
				choice = -1;
			}
		} while (choice != 0);
		scanner.close();
	}
}
