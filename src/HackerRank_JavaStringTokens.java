import java.util.Scanner;
import java.util.StringTokenizer;


public class HackerRank_JavaStringTokens {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String t = s.nextLine();
		s.close();
		
		StringTokenizer st = new StringTokenizer(t, " !,?._'@");
		
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
