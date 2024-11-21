package FloatArraySum;

import java.util.Scanner;

public class FloatArraySum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập số phần tử của mảng: ");
		int n = scanner.nextInt();

		double[] array = new double[n];
		double sum = 0;

		System.out.println("Nhập các phần tử của mảng:");
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextDouble();
			sum += array[i];
		}

		System.out.println("Tổng giá trị của các phần tử là: " + sum);
	}
}
