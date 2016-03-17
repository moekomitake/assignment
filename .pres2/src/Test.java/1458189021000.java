import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println("文字を入力してください");
		Scanner scan = new Scanner(System.in);

		Int number = scan.next();
		System.out.print("最初のトークンは：" + number);

	}
}