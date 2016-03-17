import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6 {
	public static void main(String[] args) throws IOException {
		int entry;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("”š‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		entry = Integer.parseInt(br.readLine());

		int previous = 0;
		int num = 1;
		for (int i = 0; i < entry; i++) {
			previous = num;
			num = previous + num;
			System.out.println(num);

		}
	}
}