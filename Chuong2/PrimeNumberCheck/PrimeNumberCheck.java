package PrimeNumberCheck;

import java.util.Scanner;

public class PrimeNumberCheck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập một số nguyên: ");
		int n = scanner.nextInt();

		boolean isPrime = true;

		if (n <= 1) {
			isPrime = false;
		} else {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					isPrime = false;
					break;
				}
			}
		}

		if (isPrime) {
			System.out.println(n + " là số nguyên tố.");
		} else {
			System.out.println(n + " không phải là số nguyên tố.");
		}
	}
}
