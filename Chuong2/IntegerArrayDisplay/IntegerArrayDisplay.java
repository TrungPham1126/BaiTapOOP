package IntegerArrayDisplay;

import java.util.Scanner;

public class IntegerArrayDisplay {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập số phần tử của mảng: ");
		int n = scanner.nextInt();

		int[] array = new int[n];

		System.out.println("Nhập các phần tử của mảng:");
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}

		System.out.println("Các phần tử của mảng là:");
		for (int i = 0; i < n; i++) {
			System.out.println(array[i]);
		}
	}
}
