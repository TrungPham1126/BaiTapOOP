package RoomPrice;

import java.util.Scanner;

public class RoomPrice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập số ngày nghỉ: ");
		int days = scanner.nextInt();

		System.out.print("Nhập đơn giá 1 ngày nghỉ: ");
		double pricePerDay = scanner.nextDouble();

		double totalPrice = 0;

		if (days == 1) {
			totalPrice = pricePerDay;
		} else if (days >= 2 && days <= 4) {
			totalPrice = days * pricePerDay * 0.8;
		} else if (days >= 5 && days <= 10) {
			totalPrice = days * pricePerDay * 0.6;
		} else {
			totalPrice = days * pricePerDay * 0.4;
		}

		System.out.println("Tiền phòng phải thanh toán: " + totalPrice);
	}
}
