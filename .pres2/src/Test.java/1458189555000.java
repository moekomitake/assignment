import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
	public static void main(String[] args) throws IOException {
		int number;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("数字を入力してください");
		number = Integer.parseInt(br.readLine());

		for (int i = 0; i < number; i++) {
			for (int j = 0; j < i; j++) {
				System.out.println("N");
			}
		}

		System.out.println("入力された数字は" + number + "です");

	}
}