import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6 {
	public static void main(String[] args) throws IOException {
		int number;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("”š‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		number = Integer.parseInt(br.readLine());

		int previous = 0;
		for (int i = 1; i < number; i++) {
			i = previous + i;
			previous = i;
			System.out.println(i);
		}
	}
}