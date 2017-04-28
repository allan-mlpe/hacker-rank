import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HackerRank_HackerRankInAString {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));

			int lines = Integer.parseInt(br.readLine());

			String patternString = ".*h.*a.*c.*k.*e.*r.*r.*a.*n.*k.*";
			Pattern pattern = Pattern.compile(patternString);

			while (lines-- > 0) {
				Matcher matcher = pattern.matcher(br.readLine());

				/*
				 * O método find() de Matcher busca o padrão na string inteira,
				 * considerando também substrings (é mais lento). 
				 * 
				 * Já o método matches() faz a busca na string como um todo 
				 * (é mais rápido).
				 */
				// if(matcher.find()) {
				if (matcher.matches()) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
