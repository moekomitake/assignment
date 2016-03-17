import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6 {
	public static void main(String[] args) throws IOException {
		int entry;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("”š‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		entry = Integer.parseInt(br.readLine());

		int a = 0;
		int b = 1;
		int c;
		System.out.print(a + "," + b + ",");
		for (int i = 0; i < entry; i++) {
			c = a + b;
			System.out.print(c);
		}
	}
}