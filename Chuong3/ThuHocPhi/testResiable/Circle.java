package testResiable;

public class Circle implements GeometricObjiect {
	double radius = (float) 1.0;

	public Circle() {
		this(1.0);
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getPerimeter() {
		return Math.PI * 2 * radius;
	}

	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

}
