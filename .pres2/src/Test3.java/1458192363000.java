import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test3 {
	public static void main(String[] args) throws IOException {
		int number;
		int yakusuu;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("数字を入力してください");
		number = Integer.parseInt(br.readLine());

		checksosu(number);

	}

	private static void checksosu(int number) {
		int yakusuu = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				yakusuu++;
			}
		}
		if (yakusuu < 3) {
			System.out.println(number + "は素数です！");
		} else {
			System.out.println(number + "は素数じゃねぇ！");
		}
	}
}