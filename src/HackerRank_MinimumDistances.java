import java.io.BufferedReader;
import java.io.InputStreamReader;


public class HackerRank_MinimumDistances {
	
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			br.readLine();
			
			String[] arr = br.readLine().split(" ");
			
			int minDistance = -1;
			
			for (int i = 0; i < arr.length-1; i++) {
				String item = arr[i];
		
				for (int j = i+1; j < arr.length; j++) {
					String itemAux = arr[j]; 
					if(item.equals(itemAux)) {
						int localDistance = j-i;
						if(minDistance != -1) {
							minDistance = localDistance < minDistance ? localDistance : minDistance;
						} else {
							minDistance = localDistance;
						}
					}
				}
			}
			
			System.out.println(minDistance);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
