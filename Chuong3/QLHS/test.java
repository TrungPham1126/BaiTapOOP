package QLHS;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DS_Student ds_Student = new DS_Student();
		int luachon = 0;
		while (true) {
			try {

				System.out.println("Menu");
				System.out.println("1. Thêm học sinh");
				System.out.println("2. Xóa học sinh (theo tên)");
				System.out.println("3. Hiển thị danh sách tất cả học sinh");
				System.out.println("0. Thoát chương trình");
				System.out.print("Lựa chọn của bạn: ");
				luachon = sc.nextInt();
				sc.nextLine();

				switch (luachon) {
				case 1: {
					System.out.println("nhap vao ten sinh vien");
					String tensv = sc.nextLine();
					byte tuoisv = 0;
					while (true) {
						System.out.print("Nhập tuổi sinh viên: ");
						try {
							tuoisv = sc.nextByte();
							sc.nextLine();
							break;

						} catch (Exception e) {
							System.out.println("Vui lòng nhap so tuoi la so tu nhien");
							sc.nextLine();
						}
					}

					double diemTB = 0;
					while (true) {
						System.out.print("Nhập điểm trung bình (0 - 10): ");
						try {
							diemTB = sc.nextDouble();
							sc.nextLine();

							if (diemTB < 0 || diemTB > 10) {
								System.out.println(
										"Lỗi: Điểm trung bình phải trong khoảng từ 0 đến 10. Vui lòng nhập lại.");
							} else {
								break;
							}
						} catch (Exception e) {
							System.out.println("Lỗi: Điểm trung bình phải là một số thực. Vui lòng nhập lại.");
							sc.nextLine();
						}
					}
					Student sv = new Student(tensv, tuoisv, diemTB);

					ds_Student.addStudent(sv);
					break;
				}
				case 2: {
					System.out.print("Nhập tên học sinh cần xóa: ");
					String tensv = sc.nextLine();
					Student sv = new Student(tensv);

					boolean isRemoved = ds_Student.removeStudent(sv);
					if (isRemoved) {
						System.out.println("Đã xóa sinh viên thành công.");
					} else {
						System.out.println("Không tìm thấy sinh viên có tên " + tensv);
					}
					break;
				}
				case 3: {
					ds_Student.printfST();
					break;

				}

				case 0: {
					System.out.println("Đã thoát chương trình.");
					sc.close(); // Đóng Scanner
					return; // Thoát chương trình
				}
				default:
					System.out.println("Vui lòng nhập đúng chức năng (0-3).");
					break;
				}
			} catch (Exception e) {
				System.out.println("nhap vao chu so (0-3)");
				sc.nextLine();

			}
		}

	}

}
