import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6 {
	public static void main(String[] args) throws IOException {
		int entry;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("数字を入力してください");
		entry = Integer.parseInt(br.readLine());

		int a = 0;
		int b = 1;
		int c = 1;
		for (int i = 0; i < entry - 2; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		System.out.println("結果:" + a + "+" + b + "=" + (a + b));
	}
}