import java.util.Scanner;


public class HackerRanking_Sorting {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        in.close();
        
        int numberOfSwaps = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                	
                    int aux1 = a[j];
                    int aux2 = a[j+1];
                    
                    a[j] = aux2;
                    a[j+1] = aux1;
                    
                    numberOfSwaps++;
                }
            }

            if (numberOfSwaps == 0) {
                break;
            }
        }
        
        System.out.println(String.format("Array is sorted in %d swaps.", numberOfSwaps));
        System.out.println(String.format("First Element: %d", a[0]));
        System.out.println(String.format("Last Element: %d", a[n-1]));

	}

}
