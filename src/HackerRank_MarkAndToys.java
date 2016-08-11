import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HackerRank_MarkAndToys {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String[] aux = br.readLine().split(" ");
			int[] toysPrices = new int[Integer.parseInt(aux[0])];
			int money = Integer.parseInt(aux[1]);
			
			String[] prices = br.readLine().split(" ");
			
			for (int i = 0; i < toysPrices.length; i++) {
				toysPrices[i] = Integer.parseInt(prices[i]);
			}
			
			Arrays.sort(toysPrices);
			
			int index = 0;
			int sum = 0;
			int q = 0;
			while((sum += toysPrices[index++]) <= money) {
				q++;
			}
			
			System.out.println(q);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
