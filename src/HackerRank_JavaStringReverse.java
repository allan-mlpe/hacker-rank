import java.util.Scanner;


public class HackerRank_JavaStringReverse {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String text = s.nextLine();
		
		//método reverse para reverter String
		StringBuilder sb = new StringBuilder(text).reverse();
		
		System.out.println((text.equals(sb.toString()) ? "Yes" : "No"));
		
		s.close();
		
	}
}
