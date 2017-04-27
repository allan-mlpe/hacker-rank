import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class HackerRank_MigratoryBirds {
	public static void main(String[] args) {
		try {
			int mostCommomTypeCount = 0;
			int mostCommomType = Integer.MAX_VALUE;
			Map<Integer, Integer> mapCount = new HashMap<Integer, Integer>();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			br.readLine();
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			while(st.hasMoreTokens()) {
				Integer type = Integer.parseInt(st.nextToken());
				int auxCounter = 0;
				
				if(!mapCount.containsKey(type)) {
					mapCount.put(type, 1);
					auxCounter = 1;
				} else {
					int previousCount = mapCount.get(type);
					auxCounter = previousCount+1;
					mapCount.put(type, auxCounter);
				}
				
				if(auxCounter >= mostCommomTypeCount) {
					if(auxCounter == mostCommomTypeCount && type < mostCommomType) {
						mostCommomType = type;
					} else {
						mostCommomType = type;
						mostCommomTypeCount = auxCounter;
					}
				}
			}
			
			System.out.println(mostCommomType);
				
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
