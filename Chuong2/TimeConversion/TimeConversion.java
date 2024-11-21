package TimeConversion;

import java.util.Scanner;

public class TimeConversion {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập số giờ: ");
		int hours = scanner.nextInt();

		System.out.print("Nhập số phút: ");
		int minutes = scanner.nextInt();

		System.out.print("Nhập số giây: ");
		int seconds = scanner.nextInt();

		int totalSeconds = (hours * 3600) + (minutes * 60) + seconds;

		System.out.println("Tổng số giây: " + totalSeconds);
	}
}
