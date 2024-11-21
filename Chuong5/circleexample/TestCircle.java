package circleexample;

import java.util.Random;

public class TestCircle {
	public static void main(String[] args) {
		Random rand = new Random();
		CircleCollection collection = new CircleCollection();

		for (int i = 0; i < 5; i++) {
			double radius = rand.nextInt(10) + 1;
			collection.addCircle(new Circle(radius));
		}

		System.out.println("Thông tin các hình tròn:");
		System.out.println(collection);

		System.out.println("Tổng diện tích: " + collection.calcSumArea());

		System.out.println("Diện tích lớn nhất: " + collection.findMaxArea());

		double minArea = collection.findMinArea();
		for (int i = 0; i < 5; i++) {
			if (collection.getCircle(i).getArea() == minArea) {
				System.out.println("Hình tròn có diện tích nhỏ nhất tại vị trí " + i + ": " + collection.getCircle(i));
			}
		}
	}
}
