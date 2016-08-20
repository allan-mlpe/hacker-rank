import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HackerRank_RunningTimeAndComplexity {
	
	public static boolean isPrime(int n) {
		boolean r = true;
		
		if((n != 2 && n % 2 == 0) || n < 2) {
			r = false;
		} 
		
		for(int i = 3; i < Math.sqrt(n)+1; i+=2) {
			if(n%i == 0) {
				r = false;
			}
		}
				
		return r;
	}
	
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int testCases = Integer.parseInt(br.readLine());
			
			while(testCases-- > 0) {
				System.out.println(isPrime(Integer.parseInt(br.readLine())) ? "Prime" : "Not prime");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
