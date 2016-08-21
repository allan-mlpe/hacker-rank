import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class HackerRank_BitwiseAND {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int testCases = Integer.parseInt(br.readLine());
			
			while(testCases -- > 0) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				int n = Integer.parseInt(st.nextToken());
				int k = Integer.parseInt(st.nextToken());
				
				int max = 0; 
				
				for (int i = 1; i <= n-1; i++) {
					for (int j = i+1; j <= n; j++) {
						if((i&j) > max && (i&j) < k) max = i&j;
					}
					
				}
				System.out.println(max);
			}
			 
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
