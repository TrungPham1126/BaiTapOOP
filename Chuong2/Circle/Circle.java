package Circle;

import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập bán kính hình tròn: ");
		double radius = scanner.nextDouble();

		double area = Math.PI * radius * radius;
		double circumference = 2 * Math.PI * radius;

		System.out.println("Diện tích hình tròn là: " + area);
		System.out.println("Chu vi hình tròn là: " + circumference);
	}
}
