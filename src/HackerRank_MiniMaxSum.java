import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Vector;


public class HackerRank_MiniMaxSum {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Vector<Long> nums = new Vector<Long>();
			Long max = 0l;
			Long min = Long.MAX_VALUE;
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			while(st.hasMoreTokens()) {
				nums.add(Long.parseLong(st.nextToken()));
			}
			
			for (int i = 0; i < nums.size(); i++) {
				Long aux = 0l;
				for (int j = 0; j < nums.size(); j++) {
					if(i != j) {
						aux += nums.get(j);
					}
				}
				max = aux > max ? aux : max;
				min = aux < min ? aux : min;
			}
			
			System.out.println(String.format("%d %d", min, max));
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
