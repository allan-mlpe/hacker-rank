import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class HackerRank_TheHurdleRace {
	public static void main(String[] args) {
		/*
		  	100 47
			52 99 93 84 50 64 61 87 89 97 64 69 61 90 82 53 50 63 82 87 76 78 75 55 80 68 75 83 69 81 95 89 60 59 90 100 90 64 53 60 88 93 62 50 75 77 60 93 55 79 52 47 65 74 62 60 96 49 73 92 79 54 100 81 63 58 75 80 89 94 52 85 57 72 97 81 97 66 84 77 83 94 85 68 99 54 64 83 67 84 81 65 59 89 68 91 60 79 74 57
			
			53
			
			
		 */
		
		
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
