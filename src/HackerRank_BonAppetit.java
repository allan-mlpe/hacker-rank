

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HackerRank_BonAppetit {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] aux = br.readLine().split(" ");
			int n = Integer.parseInt(aux[0]);
			int noEatIndex = Integer.parseInt(aux[1]);
			int totalCost = 0;
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			
			for (int i = 0; i < n; i++) {
				if(i != noEatIndex) {
					totalCost += Integer.parseInt(st.nextToken()); 
				} else {
					st.nextToken();
				}
			}
			
			int bActual = totalCost/2;
			int bCharged = Integer.parseInt(br.readLine());
			
			System.out.println(bActual == bCharged ? "Bon Appetit" : (bCharged - bActual));
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
