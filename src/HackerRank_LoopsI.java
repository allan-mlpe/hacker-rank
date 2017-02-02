import java.util.Scanner;

public class HackerRank_LoopsI {

    public static void main(String[] args) {
        try {
			Scanner input = new Scanner(System.in);
			
			int n = input.nextInt();
			
			for (int i = 1; i <= 10; i++) {
				System.out.println(String.format("%d x %d = %d", n, i, n*i));
			}
			input.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
    }
}