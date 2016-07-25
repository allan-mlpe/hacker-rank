import java.util.Scanner;


public class HackerRank_StaticBlock {
	
	static boolean flag;
	static int B;
	static int H;
	
	static {
	    Scanner s = new Scanner(System.in);
	    
	    B = s.nextInt();
	    H = s.nextInt();
	    
	    flag = B > 0 && H > 0 ? true : false;
	    s.close();
	}
	
	public static void main(String[] args) {
		//Scanner s = new Scanner(System.in);
		
		System.out.println(flag);
		
	}
}
