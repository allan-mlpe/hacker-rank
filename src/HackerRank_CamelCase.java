import java.io.BufferedReader;
import java.io.InputStreamReader;


public class HackerRank_CamelCase {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String line = br.readLine();
			int words = 1;
			
			for(int i = 0; i < line.length(); i++) {
				Character c = line.charAt(i);
				if(Character.isUpperCase(c)) {
					words++;
				}
			}
			System.out.println(words);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}