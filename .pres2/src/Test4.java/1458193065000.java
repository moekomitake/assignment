import java.io.IOException;

public class Test4 {
	public static void main(String[] args) throws IOException {
		int score[] = { 15, 8, 12, 18, 20, 20, 9, 16, 20, 17 };

		for (int i = 0; i < score.length; i++) {
			System.out.print(i + 1 + " " + score[i] + ":");
			for (int j = 0; j < score[i]; j++) {
				if (j + 1 % 5 == 0) {
					System.out.print("|");
				} else {
					System.out.print("#");
				}
			}
			System.out.println("");
		}
	}
}