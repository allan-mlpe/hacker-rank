package roockie_ranking_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class HackerRank_BirthdayCakeCandles {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			br.readLine();
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			int maxHeight = 0;
			
			while(st.hasMoreTokens()) {
				Integer candleHeight = Integer.parseInt(st.nextToken());
				maxHeight = maxHeight < candleHeight ? candleHeight : maxHeight;
				
				if(map.containsKey(candleHeight)) {
					map.put(candleHeight, map.get(candleHeight)+1);
				} else {
					map.put(candleHeight, 1);
				}
			}
			
			System.out.println(map.get(maxHeight));
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
