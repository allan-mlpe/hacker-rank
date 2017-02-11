package roockie_ranking_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HackerRankInAStringRegex {

	public static void main(String[] args) {
		try {
			String regex_pattern = ".*h.*a.*c.*k.*e.*r.*r.*a.*n.*k.*";
			Pattern p = Pattern.compile(regex_pattern);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int queries = Integer.parseInt(br.readLine());
			
			while (queries-->0) {
				Matcher m = p.matcher(br.readLine());
				
				//System.out.println(m.find() ? "YES" : "NO"); //find tenta casar o padrão da regex inclusive com substrings (é mais lento)
				System.out.println(m.matches() ? "YES" : "NO"); //matches tenta casar o padrão da regex com a string como um todo
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
