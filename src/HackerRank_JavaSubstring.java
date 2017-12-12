import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class HackerRank_JavaSubstring {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int startIndex = Integer.parseInt(st.nextToken());
			int endIndex = Integer.parseInt(st.nextToken());
			
			System.out.println(str.substring(startIndex, endIndex));
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
