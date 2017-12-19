import java.io.BufferedReader;
import java.io.InputStreamReader;


public class HackerRank_ValidUsernameRegularExpression {
	
	private static final String USERNAME_REGEX = "^[a-zA-Z][\\w\\d]{7,29}$";
	
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int testCases = Integer.parseInt(br.readLine());
			
			String username;
			
			while(testCases-- > 0) {
				username = br.readLine();
				System.out.println(username.matches(USERNAME_REGEX) ? "Valid" : "Invalid");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
