package currencyexchange;

import java.util.Scanner;

public class TestExchange {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Exchange exchange = new Exchange();

		System.out.print("Mời nhập vào mã tiền tệ thứ nhất: ");
		String code1 = scanner.nextLine();

		System.out.print("Mời nhập mã tiền tệ thứ hai: ");
		String code2 = scanner.nextLine();

		System.out.print("Mời nhập lượng tiền cần chuyển đổi: ");
		double amount = scanner.nextDouble();

		double result = exchange.convert(code1, code2, amount);
		if (result != -1) {
			System.out.println("Lượng tiền sau khi đổi: " + result);
		} else {
			System.out.println("Không tìm thấy tỷ giá chuyển đổi.");
		}
	}
}
