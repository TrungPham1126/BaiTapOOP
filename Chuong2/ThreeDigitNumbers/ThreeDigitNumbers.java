package ThreeDigitNumbers;

public class ThreeDigitNumbers {
	public static void main(String[] args) {
		for (int i = 100; i < 1000; i++) {
			if (i % 6 == 0) {
				System.out.println(i);
			}
		}
	}
}
