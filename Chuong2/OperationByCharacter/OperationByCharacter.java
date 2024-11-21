package OperationByCharacter;

import java.util.Scanner;

public class OperationByCharacter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập số thực thứ nhất: ");
		double num1 = scanner.nextDouble();

		System.out.print("Nhập số thực thứ hai: ");
		double num2 = scanner.nextDouble();

		System.out.print("Nhập ký tự (A, S, M, D): ");
		char operation = scanner.next().charAt(0);

		switch (operation) {
		case 'A':
			System.out.println("Tổng: " + (num1 + num2));
			break;

		case 'S':
			System.out.println("Hiệu: " + (num1 - num2));
			break;

		case 'M':
			System.out.println("Tích: " + (num1 * num2));
			break;

		case 'D':
			if (num2 != 0) {
				System.out.println("Thương: " + (num1 / num2));
			} else {
				System.out.println("Không thể chia cho 0.");
			}
			break;

		default:
			System.out.println("Ký tự vừa nhập không hợp lệ.");
		}

		scanner.close();
	}
}
