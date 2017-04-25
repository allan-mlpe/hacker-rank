import java.io.BufferedReader;
import java.io.InputStreamReader;



public class HackerRank_GradingStudents {
	
	public static int round(int n) {
		
		if(n >= 38) {
			int mod = n % 5;
			
			if(n >= 3) {
				n += 5-mod;
			}
		}
		
		return n;
	}
	
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());
			
			while(n-->0) {
				int grade = Integer.parseInt(br.readLine());
				System.out.println(round(grade));
			}
			
			br.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
