import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
	public static void main(String[] args) throws IOException {
		int number;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("��������͂��Ă�������");
		number = Integer.parseInt(br.readLine());

		for (int i = 0; i < number; i++) {
			System.out.println();
			for (int j = 0; j < i; j++) {
				System.out.print("N");
			}

		}

		System.out.println("���͂��ꂽ������" + number + "�ł�");

	}
}