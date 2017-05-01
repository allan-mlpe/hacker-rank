import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class HackerRank_CatsAndAMouse {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int queries = Integer.parseInt(br.readLine());
			
			while(queries-- > 0) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				String response;
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				int z = Integer.parseInt(st.nextToken());
				
				int mouseADistance = Math.abs(x-z);
				int mouseBDistance = Math.abs(y-z);
				
				if(mouseADistance == mouseBDistance) {
					response = "Mouse C";
				} else {
					response = mouseADistance < mouseBDistance ? "Cat A" : "Cat B";
				}
				
				System.out.println(response);
			}
		} catch(Exception e) {
			
		}
	}

}
