import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class HackerRank_Java2DArray {

    private static int getLargestHourGlass(int[][] matrix) {
        int maxSum = Integer.MIN_VALUE;

        int topBottomGlassIndex = 0;
        int middleGlassIndex = topBottomGlassIndex+1;

        for (int i = 0; i < 4; i++) {
            int[] topArr = matrix[i];
            int[] middleArr = matrix[i+1];
            int[] bottomArr = matrix[i+2];

            while(topBottomGlassIndex <= 3) {
                int partialSum = topArr[topBottomGlassIndex]
                        + topArr[topBottomGlassIndex+1]
                        + topArr[topBottomGlassIndex+2]
                        + middleArr[middleGlassIndex]
                        + bottomArr[topBottomGlassIndex]
                        + bottomArr[topBottomGlassIndex+1]
                        + bottomArr[topBottomGlassIndex+2];

                /*System.out.println(String.format("%d\t%d\t%d", topArr[topBottomGlassIndex],topArr[topBottomGlassIndex+1],topArr[topBottomGlassIndex+2]));
                System.out.println(String.format("\t%d\t", middleArr[middleGlassIndex]));
                System.out.println(String.format("%d\t%d\t%d", bottomArr[topBottomGlassIndex],bottomArr[topBottomGlassIndex+1],bottomArr[topBottomGlassIndex+2]));
                System.out.println();
                System.out.println();*/

                maxSum = partialSum > maxSum ? partialSum : maxSum;

                topBottomGlassIndex++;
                middleGlassIndex++;
            }

            topBottomGlassIndex = 0;
            middleGlassIndex = topBottomGlassIndex+1;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[6][6];
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            for (int i = 0; i < 6; i++) {
                List<String> aux = Arrays.asList(br.readLine().split(" "));

                // mapeia os items da lista para inteiros
                IntStream intStream = aux.stream()
                        .mapToInt(item -> Integer.parseInt(item));

                // convert o stream para array e o adiciona na matriz
                matrix[i] = intStream.toArray();
            }
            System.out.println(getLargestHourGlass(matrix));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
