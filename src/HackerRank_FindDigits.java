import java.util.Scanner;


public class HackerRank_FindDigits {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int count_aux = 0;
            int n = in.nextInt();
            
            String aux = Integer.toString(n);
            for(int i=0; i < aux.length(); i++) {
                int d = Integer.parseInt(String.valueOf(aux.charAt(i))); 
                if(d != 0 && n%d == 0) {
                    count_aux++;
                }
            
            }
            System.out.println(count_aux);
        }
        in.close();
	}

}
