import java.io.IOException;

public class Test5 {
	public static void main(String[] args) throws IOException {
		int score[] = { 15, 8, 12, 18, 20, 20, 9, 16, 20, 17 };

		System.out.println(average(score));
	}

	public static double average(int[] score) {
		int sum = 0;
		double ave = 0;
		for (int i = 0; i < score.length; i++) {
			sum = sum + score[i];
		}
		ave = sum / score.length;
		return ave;
	}
}