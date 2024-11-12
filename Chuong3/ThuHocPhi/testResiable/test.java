package testResiable;

public class test {
	public static void main(String[] args) {
		ResizableCircle rc = new ResizableCircle(5.0);
		System.out.println("Chu vi: " + rc.getPerimeter());
		System.out.println("Diện tích: " + rc.getArea());

		rc.resize(50);
		System.out.println("Sau khi thay đổi kích thước tăng 50%");
		System.out.println("Chu vi mới: " + rc.getPerimeter());
		System.out.println("Diện tích mới: " + rc.getArea());
	}
}
