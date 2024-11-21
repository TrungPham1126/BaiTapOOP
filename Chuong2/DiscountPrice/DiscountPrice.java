package DiscountPrice;

import java.util.Scanner;

public class DiscountPrice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập giá bán gốc: ");
		double originalPrice = scanner.nextDouble();

		System.out.print("Nhập phần trăm giảm giá: ");
		double discountPercentage = scanner.nextDouble();

		double discountedPrice = originalPrice * (1 - discountPercentage / 100);

		System.out.println("Giá bán sau khi giảm là: " + discountedPrice);
	}
}
