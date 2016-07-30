import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class HackerRank_IceCreamParlor {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int testCases = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < testCases; i++) {
				int M = Integer.parseInt(br.readLine());
				int[] flavorsCosts = new int[Integer.parseInt(br.readLine())];
				
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				for (int j = 0; j < flavorsCosts.length; j++) {
					flavorsCosts[j] = Integer.parseInt(st.nextToken());
				}
				
				
				int a = 0;
				int b = 0;
				for (int j = 0; j < flavorsCosts.length-1; j++) {
					for (int j2 = j+1; j2 < flavorsCosts.length; j2++) {
						if(flavorsCosts[j]+flavorsCosts[j2] == M) {
							a = j+1;
							b = j2+1;
							break;
						}
					}
				}
				System.out.println(a + " " + b);
				
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
