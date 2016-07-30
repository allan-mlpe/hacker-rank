import java.util.Scanner;


public class HackerRank_SaveThePrisoner {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        
        int testCases = s.nextInt();
        
        for(int i = 0; i < testCases; i++) {
            int prisioners = s.nextInt();
            int sweets = s.nextInt();
            int idStart = s.nextInt();
            
            int resto = sweets % prisioners;
            int deslocamento = idStart-1;
            int aux = resto + deslocamento;
            
            int ultimo = aux % prisioners != 0 ? aux % prisioners : prisioners;
            System.out.println(ultimo);
        }
        s.close();
	}
}
