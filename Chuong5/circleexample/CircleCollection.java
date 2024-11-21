package circleexample;

import java.util.ArrayList;

public class CircleCollection {
	private ArrayList<Circle> al;

	public CircleCollection() {
		al = new ArrayList<>();
	}

	public void addCircle(Circle c) {
		al.add(c);
	}

	public Circle getCircle(int pos) {
		return al.get(pos);
	}

	public void setCircle(int pos, Circle c) {
		al.set(pos, c);
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		for (Circle circle : al) {
			result.append(circle.toString()).append("\n");
		}
		return result.toString();
	}

	public double calcSumArea() {
		double sum = 0;
		for (Circle circle : al) {
			sum += circle.getArea();
		}
		return sum;
	}

	public double findMinArea() {
		double min = Double.MAX_VALUE;
		for (Circle circle : al) {
			min = Math.min(min, circle.getArea());
		}
		return min;
	}

	public double findMaxArea() {
		double max = Double.MIN_VALUE;
		for (Circle circle : al) {
			max = Math.max(max, circle.getArea());
		}
		return max;
	}
}
