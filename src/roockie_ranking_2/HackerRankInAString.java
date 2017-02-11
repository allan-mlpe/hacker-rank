package roockie_ranking_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HackerRankInAString {

	public static void main(String[] args) {
		try {
			char[] letters = {'h', 'a', 'c', 'k', 'e', 'r', 'r', 'a', 'n', 'k'};
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int queries = Integer.parseInt(br.readLine());
			
			while (queries-->0) {	
				String line = br.readLine();
				boolean hasHackerRank = true;
				for (int i = 0; i < letters.length; i++) {
					char l = letters[i];
					int index = line.indexOf(l);
					if (index < 0) {
						hasHackerRank = false;
						break;
					}

					line = line.substring(index + 1);
				}
				System.out.println(hasHackerRank ? "YES" : "NO");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
