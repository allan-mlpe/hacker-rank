import java.io.BufferedReader;
import java.io.InputStreamReader;


public class HackerRank_BinaryNumbers {
	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int n = Integer.parseInt(br.readLine());
			
			String bin = Integer.toBinaryString(n);
			
			int maxSeq = 0;
			int aux = 0;
			
			for(int i = 0; i < bin.length(); i++) {
				if(bin.charAt(i) == '1') {
					aux++;
				} else {
					maxSeq = aux > maxSeq ? aux : maxSeq;
					aux = 0;
				}
			}
			
			System.out.println(Math.max(maxSeq, aux));
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
