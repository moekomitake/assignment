import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6 {
	public static void main(String[] args) throws IOException {
		int entry;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("��������͂��Ă�������");
		entry = Integer.parseInt(br.readLine());

		int previous = 0;
		int num = 1;
		for (int i = 1; i < number; i++) {
			i = previous + i;
			System.out.println(i);
			previous = i;
		}
	}
}