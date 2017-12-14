import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HackerRank_JavaStringsIntroduction {

	public static String capitalize(String word) { 
		return Character.toUpperCase(word.charAt(0)) + word.substring(1);
	}
	
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String a = br.readLine();
			String b = br.readLine();
			
			System.out.println(a.length() + b.length());
			System.out.println(b.compareTo(a) <= 0 ? "Yes" : "No");
			System.out.println(String.format("%s %s", capitalize(a), capitalize(b)));
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
