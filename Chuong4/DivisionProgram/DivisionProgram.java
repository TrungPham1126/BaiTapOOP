package DivisionProgram;

import java.util.Scanner;

public class DivisionProgram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			// Nhập số thứ nhất
			System.out.print("Nhập số nguyên thứ nhất: ");
			int num1 = scanner.nextInt();

			// Nhập số thứ hai
			System.out.print("Nhập số nguyên thứ hai: ");
			int num2 = scanner.nextInt();

			// Kiểm tra số chia có bằng 0 hay không
			if (num2 == 0) {
				throw new ArithmeticException("Lỗi: Không thể chia cho 0.");
			}

			// Thực hiện phép chia
			double result = (double) num1 / num2;
			System.out.println("Kết quả của phép chia: " + result);

		} catch (ArithmeticException e) {
			// Xử lý ngoại lệ chia cho 0
			System.out.println(e.getMessage());
		} catch (Exception e) {
			// Xử lý ngoại lệ chung khác
			System.out.println("Đã xảy ra lỗi: " + e.getMessage());
		} finally {
			// Đóng scanner
			scanner.close();
			System.out.println("Chương trình kết thúc.");
		}
	}
}
