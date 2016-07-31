import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;


public class HackerRank_DictionariesAndMaps {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int testCases = Integer.parseInt(br.readLine());
			
			HashMap<String, String> contacts = new HashMap<String, String>();
			
			for (int i = 0; i < testCases; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				contacts.put(st.nextToken(), st.nextToken());
			}
			
			String query;
			
			while((query = br.readLine()) != null) {
				String result;
				if(contacts.containsKey(query)) {
					result = String.format("%s=%s", query, contacts.get(query));
				} else {
					result = "Not found";
				}
				System.out.println(result);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
