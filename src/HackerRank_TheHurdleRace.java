import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class HackerRank_TheHurdleRace {
	public static void main(String[] args) {
		/*
		  	100 47
			52 99 93 84 50 64 61 87 89 97 64 69 61 90 82 53 50 63 82 87 76 78 75 55 80 68 75 83 69 81 95 89 60 59 90 100 90 64 53 60 88 93 62 50 75 77 60 93 55 79 52 47 65 74 62 60 96 49 73 92 79 54 100 81 63 58 75 80 89 94 52 85 57 72 97 81 97 66 84 77 83 94 85 68 99 54 64 83 67 84 81 65 59 89 68 91 60 79 74 57
			
			53
			
			=======
			
			100 53
			86 4 83 20 6 81 58 59 53 2 54 62 25 35 79 64 27 49 32 95 100 20 58 39 92 30 67 89 58 81 100 66 73 29 75 81 70 55 18 28 7 35 98 52 30 11 69 48 84 54 13 14 15 86 34 82 92 26 8 53 62 57 50 31 61 85 88 5 80 64 90 52 47 43 40 93 69 70 16 43 7 25 99 12 63 99 71 76 55 17 90 43 27 20 42 84 39 96 75 1
			
			47
			
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
