package circleexample;

public class Circle {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public String toString() {
		return "Bán kính: " + radius + ", Diện tích: " + getArea();
	}
}
