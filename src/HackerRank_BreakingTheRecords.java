import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class HackerRank_BreakingTheRecords {
	
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			br.readLine();
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			int firstScore = Integer.parseInt(st.nextToken());
			
			int max = firstScore;
			int min = firstScore;
			
			int maxCount = 0;
			int minCount = 0;
			
			while(st.hasMoreTokens()) {
				int scored = Integer.parseInt(st.nextToken());
				
				if(scored > max) {
					max = scored;
					maxCount++;
				}
				
				if(scored < min) {
					min = scored;
					minCount++;
				}
			}
			
			System.out.println(String.format("%d %d", maxCount, minCount));
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
