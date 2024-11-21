package InvalidDateException;

public class Test {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		try {
			// Nhập ngày, tháng, năm
			System.out.print("Nhập ngày: ");
			int day = scanner.nextInt();

			System.out.print("Nhập tháng: ");
			int month = scanner.nextInt();

			System.out.print("Nhập năm: ");
			int year = scanner.nextInt();

			// Kiểm tra tính hợp lệ
			if (month < 1 || month > 12) {
				throw new InvalidDateException("Tháng không hợp lệ!");
			}
			if (day < 1 || day > 31) {
				throw new InvalidDateException("Ngày không hợp lệ!");
			}
			if (year < 0) {
				throw new InvalidDateException("Năm không hợp lệ!");
			}

			System.out.println("Ngày hợp lệ: " + day + "/" + month + "/" + year);

		} catch (InvalidDateException e) {
			System.out.println("Lỗi: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Đã xảy ra lỗi nhập liệu!");
		} finally {
			scanner.close();
		}
	}
}