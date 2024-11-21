package FindStudentByScore;

import java.util.Scanner;

public class FindStudentByScore {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập số lượng sinh viên: ");
		int n = scanner.nextInt();

		int[] scores = new int[n];
		System.out.println("Nhập điểm thi tiếng Anh của các sinh viên:");

		for (int i = 0; i < n; i++) {
			scores[i] = scanner.nextInt();
		}

		System.out.print("Nhập điểm thi cần tìm: ");
		int targetScore = scanner.nextInt();

		boolean found = false;
		for (int i = 0; i < n; i++) {
			if (scores[i] == targetScore) {
				System.out.println("Sinh viên có điểm " + targetScore + " là sinh viên thứ " + (i + 1));
				found = true;
			}
		}

		if (!found) {
			System.out.println("Không tìm thấy sinh viên với điểm " + targetScore);
		}
	}
}
