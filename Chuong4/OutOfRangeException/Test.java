package OutOfRangeException;

public class Test {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		try {
			// Nhập lương
			System.out.print("Nhập lương của bạn: ");
			double salary = scanner.nextDouble();

			// Kiểm tra lương trong phạm vi
			if (salary < 5000000 || salary > 20000000) {
				throw new OutOfRangeException("Lương ngoài phạm vi cho phép (5.000.000 - 20.000.000)!");
			}

			System.out.println("Lương hợp lệ: " + salary);

		} catch (OutOfRangeException e) {
			System.out.println("Lỗi: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Đã xảy ra lỗi nhập liệu!");
		} finally {
			scanner.close();
		}
	}
}
