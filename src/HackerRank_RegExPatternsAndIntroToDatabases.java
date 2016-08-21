import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.StringTokenizer;


public class HackerRank_RegExPatternsAndIntroToDatabases {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int testCases = Integer.parseInt(br.readLine());
			ArrayList<String> names = new ArrayList<String>();
			
			while(testCases-- > 0) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				String name = st.nextToken();
				String email = st.nextToken();
				
				if(email.matches("^[a-z.]+@gmail.com$")) {
					names.add(name);
				}
			}
			
			Collections.sort(names);
			Iterator<String> itNames = names.iterator();
			
			while(itNames.hasNext()) System.out.println(itNames.next());

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
