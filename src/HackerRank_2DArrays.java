import java.io.BufferedReader;
import java.io.InputStreamReader;


public class HackerRank_2DArrays {
	
	public static void main(String[] args) {
		try {
			//criando a matriz a partir da entrada
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int[][] matrix = new int[6][6];
			
			for(int i = 0; i < 6; i++) {
				String[] aux = br.readLine().split(" ");
				for(int j = 0; j < 6; j++) {
					matrix[i][j] = Integer.parseInt(aux[j]);
				}
			}
			
			int maxSum = Integer.MIN_VALUE;
			
			//fazendo a soma
			for (int i = 0; i <= matrix.length-3; i++) {
				
				for (int j = 0; j <= matrix.length-3; j++) {
					int aux = //1 linha
					matrix[i][j] + matrix[i][j+1] + matrix[i][j+2] +
					//2 linha
					matrix[i+1][j+1] +
					//3 linha
					matrix[i+2][j] + matrix[i+2][j+1] + matrix[i+2][j+2];
					
					maxSum = Math.max(maxSum, aux);
					/*
					System.out.println(matrix[i][j] + "\t" +matrix[i][j+1] + "\t" + matrix[i][j+2]);
					System.out.println("\t" + matrix[i+1][j+1] + "\t");
					System.out.println(matrix[i+2][j] + "\t" +matrix[i+2][j+1] + "\t" + matrix[i+2][j+2]);
					
					System.out.println("\n\n");
					*/
				}
			}
			
			System.out.println(maxSum);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
