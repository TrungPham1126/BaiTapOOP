package testResiable;

public class ResizableCircle extends Circle implements Resizable {
	public ResizableCircle() {
		super();
	}

	public ResizableCircle(double radius) {
		super(radius);
	}

	public void resize(int percent) {
		radius = radius * (1 + percent / 100.0);
	}

}
