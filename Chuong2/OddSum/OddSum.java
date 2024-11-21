package OddSum;

public class OddSum {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i += 2) {
			sum += i;
		}
		System.out.println("Tổng các số lẻ từ 1 đến 100 là: " + sum);
	}
}
