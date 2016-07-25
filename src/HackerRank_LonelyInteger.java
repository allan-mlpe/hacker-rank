import java.util.Scanner;
import java.util.Vector;


public class HackerRank_LonelyInteger {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		Vector<Integer> lista = new Vector<Integer>();
		
		for (int i = 0; i < n; i++) {
			lista.add(s.nextInt());
		}
		
		
		for (Integer integer : lista) {
			if(lista.indexOf(integer) == lista.lastIndexOf(integer)) {
				System.out.println(integer);
				break;
			}
		}
		s.close();
	}

}
