package EvenSum;

public class EvenSum {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 2; i <= 100; i += 2) {
			sum += i;
		}
		System.out.println("Tổng các số chẵn từ 1 đến 100 là: " + sum);
	}
}