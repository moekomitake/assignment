import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test3 {
	public static void main(String[] args) throws IOException {
		int number;
		int yakusuu;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("”š‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		number = Integer.parseInt(br.readLine());

		check(number);
		
		private static void check(int number){
			int yakusuu = 0;
			for(int i = 1; i<=number; i++){
				if(number%i==0){
					yakusuu++;
				}
			}
			if(yakusuu<3){
				System.out.println(number+"‚Í‘f”‚Å‚·I");
			}else{
				System.out.println(number+"‚Í‘f”‚¶‚á‚Ë‚¥I");
			}
		}

				
	}
}