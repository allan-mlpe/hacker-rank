import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Solução para o problema Day 6: Let's Review da seção 30 Days of Code
 * @author Allan
 */
public class HackerRank_LetsReview {
	public static void main(String[] args) {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		try {
			int testCases = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < testCases; i++) {
				String s = br.readLine();
				StringBuilder evenIndexed = new StringBuilder();
				StringBuilder oddIndexed = new StringBuilder();
				
				for (int j = 0; j < s.length(); j++) {
					if(j%2 == 0) {
						evenIndexed.append(s.charAt(j));
					} else {
						oddIndexed.append(s.charAt(j));
					}
				}
				System.out.println(String.format("%s %s", evenIndexed.toString(), oddIndexed.toString()));
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
