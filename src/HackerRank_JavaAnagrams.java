import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class HackerRank_JavaAnagrams {
	
	public static boolean isAnagram(String a, String b) {
		List<String> strA = Arrays.asList(a.toLowerCase().split(""));
		List<String> strB = Arrays.asList(b.toLowerCase().split(""));
		
		Collections.sort(strB);
		Collections.sort(strA);
		
		return strA.equals(strB);
	}

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String a = br.readLine();
			String b = br.readLine();
			
			System.out.println(isAnagram(a, b) ? "Anagrams" : "Not Anagrams");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
