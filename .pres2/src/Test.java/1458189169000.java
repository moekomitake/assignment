import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {
	public static void main(String[] args) {
		int number;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("数字を入力してください");
		number = Integer.parseInt(br.readLine());

	}
}