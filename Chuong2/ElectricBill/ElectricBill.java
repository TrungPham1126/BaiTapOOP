package ElectricBill;

import java.util.Scanner;

public class ElectricBill {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập số điện đã sử dụng: ");
		int electricityUsed = scanner.nextInt();

		double bill = 0;

		if (electricityUsed >= 0 && electricityUsed <= 50) {
			bill = electricityUsed * 1484;
		} else if (electricityUsed >= 51 && electricityUsed <= 100) {
			bill = electricityUsed * 1786;
		} else if (electricityUsed >= 101 && electricityUsed <= 200) {
			bill = electricityUsed * 2242;
		} else {
			bill = electricityUsed * 2500; // Giả sử từ 201 trở đi là 2500
		}

		System.out.println("Số tiền điện phải trả: " + bill);
	}
}
