package InputDisplay;

import java.util.Scanner;

public class InputDisplay {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập một số nguyên: ");
		int integer = scanner.nextInt();

		System.out.print("Nhập một số thực: ");
		double decimal = scanner.nextDouble();

		System.out.print("Nhập một ký tự: ");
		char character = scanner.next().charAt(0);

		scanner.nextLine();
		System.out.print("Nhập một chuỗi: ");
		String string = scanner.nextLine();

		System.out.println("Số nguyên vừa nhập: " + integer);
		System.out.println("Số thực vừa nhập: " + decimal);
		System.out.println("Ký tự vừa nhập: " + character);
		System.out.println("Chuỗi vừa nhập: " + string);

		scanner.close();
	}
}
