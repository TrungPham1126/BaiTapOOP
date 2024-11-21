package BasicArithmetic;

import java.util.Scanner;

public class BasicArithmetic {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập số nguyên thứ nhất: ");
		int num1 = scanner.nextInt();

		System.out.print("Nhập số nguyên thứ hai: ");
		int num2 = scanner.nextInt();

		System.out.println("Tổng: " + (num1 + num2));
		System.out.println("Hiệu: " + (num1 - num2));
		System.out.println("Tích: " + (num1 * num2));

		if (num2 != 0) {
			System.out.println("Thương: " + ((double) num1 / num2));
		} else {
			System.out.println("Không thể chia cho 0.");
		}

		scanner.close();
	}
}
