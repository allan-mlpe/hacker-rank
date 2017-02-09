import java.io.BufferedReader;
import java.io.InputStreamReader;


public class HackerRank_AppleAndOrange {
	
	public static int[] convertToIntArray(String line) {
		String[] aux = line.split(" ");
		int[] arr = new int[aux.length];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(aux[i]);
			
		}
		return arr;
	}

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int[] housePosition = convertToIntArray(br.readLine());
			int[] treesPosition = convertToIntArray(br.readLine());
			int[] numFruits = convertToIntArray(br.readLine());
			int[] applesPositioning = convertToIntArray(br.readLine());
			int[] orangesPositioning = convertToIntArray(br.readLine());
			
			int apples = 0;
			int oranges = 0;
			
			for (int i = 0; i < applesPositioning.length; i++) {
				int distance = applesPositioning[i] + treesPosition[0];
				if(distance >= housePosition[0] && distance <= housePosition[1]) apples++;
				
			}
			
			for (int i = 0; i < orangesPositioning.length; i++) {
				int distance = orangesPositioning[i] + treesPosition[1];
				if(distance >= housePosition[0] && distance <= housePosition[1]) oranges++;
			}
			
			System.out.println(apples);
			System.out.println(oranges);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
