import java.io.BufferedReader;
import java.io.InputStreamReader;


public class HackerRank_JavaRegex {
	
	private static final String IP_REGEX = "^(0{1,3}|0{0,1}[0-9]{1,2}|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.(0{1,3}|0{0,1}[0-9]{1,2}|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.(0{1,3}|0{0,1}[0-9]{1,2}|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.(0{1,3}|0{0,1}[0-9]{1,2}|1[0-9][0-9]|2[0-4][0-9]|25[0-5])$";
	
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String ip;
			
			while((ip = br.readLine()) != null && !ip.isEmpty()) {
				System.out.println(ip.matches(IP_REGEX));
			}
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
