import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;


public class HackerRank_SparseArrays {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int nStrings = Integer.parseInt(br.readLine());
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			
			for (int i = 0; i < nStrings; i++) {
				String string = br.readLine();
				if(map.get(string) == null) {
					map.put(string, 1);
				} else {
					map.replace(string, map.get(string)+1);
				}
			}
			
			int nQueries = Integer.parseInt(br.readLine());
			for (int i = 0; i < nQueries; i++) {
				String query = br.readLine();
				//o hacker rank só aceitou a impressão do map.get(query) com o método toString()
				//no eclipse passou sem essa necessidade.
				System.out.println(map.get(query) != null ? map.get(query).toString() : 0);
			}
			
			
		} catch(Exception o) {
			o.printStackTrace();
		}
		
	}

}
