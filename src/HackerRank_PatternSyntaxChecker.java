import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Pattern;


public class HackerRank_PatternSyntaxChecker {
	
	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int times = Integer.parseInt(br.readLine());
			
			while(times-- > 0) {
				try {
					Pattern.compile(br.readLine());
					System.out.println("Valid");
				} catch(Exception e) {
					System.out.println("Invalid");
				}
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
