import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {
	public static void main(String[] args) throws IOException {
		int score[] = new int[10];
		int score[] = { 15, 8, 12, 18, 20, 20, 9, 16, 20, 17 };

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("数字を入力してください");
		number = Integer.parseInt(br.readLine());

		checksosu(number);
	}

}