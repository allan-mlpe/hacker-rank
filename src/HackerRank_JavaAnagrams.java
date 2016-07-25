import java.util.Arrays;
import java.util.HashSet;


public class HackerRank_JavaAnagrams {

	public static void main(String[] args) {
		
		String a = "anagramm";
		String b = "marganaa";
		
		
		HashSet<String> c = new HashSet<>(Arrays.asList(a.split("")));
		
		
		HashSet<String> bSet = new HashSet<String>(Arrays.asList(b.split("")));
		
		
		System.out.println(c.equals(bSet));
	}

}
