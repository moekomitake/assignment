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
		int c = 0;
		System.out.print(a + "," + b + ",");
		for (int i = 0; i < entry; i++) {
			c = a + b;
			System.out.print(c + ",");
			a = b;
			b = c;
		}
		System.out.println(a + "+" + b + "=" + (a + b));
	}
}