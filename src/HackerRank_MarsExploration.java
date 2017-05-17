import java.io.BufferedReader;
import java.io.InputStreamReader;


public class HackerRank_MarsExploration {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String msg = br.readLine();
			
			int wrongCharacters = 0;
			
			for (int i = 0; i <= msg.length()-3; i = i+3) {
				
				String subMsg = msg.substring(i, i+3);
				
				if(subMsg.charAt(0) != 'S') {
					wrongCharacters += 1;
				}
				
				if(subMsg.charAt(1) != 'O') {
					wrongCharacters += 1;
				}
				
				if(subMsg.charAt(2) != 'S') {
					wrongCharacters += 1;
				}
				
			}
			System.out.println(wrongCharacters);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
