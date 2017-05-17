import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class HackerRank_TheHurdleRace {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String[] aux = br.readLine().split(" ");
			
			int maxJumpHeight = Integer.parseInt(aux[1]);
			int numMagicBeverage = 0;
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int currentHurdle = Integer.parseInt(st.nextToken());
			
			
			while(st.hasMoreTokens()) {
				int nextHurdle = Integer.parseInt(st.nextToken());
				if(nextHurdle > currentHurdle) {
				int differenceHeight = Math.abs(currentHurdle - nextHurdle);
				
				if(differenceHeight > maxJumpHeight) {
					int diff = Math.abs(nextHurdle - maxJumpHeight);
					numMagicBeverage += diff;
					maxJumpHeight += diff;
				}
				}
				currentHurdle = nextHurdle;
			}
			
			System.out.println(numMagicBeverage);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
