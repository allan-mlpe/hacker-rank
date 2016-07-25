import java.util.Scanner;


public class HackerRank_MaximizingXor {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int L = s.nextInt();
		int R = s.nextInt();
		int maxValue = 0;
		
		for (int i = L; i <= R; i++) {
			for (int j = L; j <= R; j++) {
				if((i ^ j) > maxValue) {
					maxValue = i ^j; 
				}
			}
		}
		System.out.println(maxValue);
		
		s.close();
	}

}
