import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {
	public static void main(String[] args) throws IOException {
		int number;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("数字を入力してください");
		number = Integer.parseInt(br.readLine());

		for (int i = 0; i < number + 1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.println("N");
			}
			System.out.println();
		}
		for (int i = number; i > 0; i++) {
			for (int j = 0; j < i; j--) {
				System.out.println("N");
			}
			System.out.println();
		}

	}
}