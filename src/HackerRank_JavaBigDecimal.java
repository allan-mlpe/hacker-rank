import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;

public class HackerRank_JavaBigDecimal {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(br.readLine());
            String[] arr = new String[n];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = br.readLine();
            }

            Comparator<String> comparator = new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    BigDecimal o1Num = new BigDecimal(o1);
                    BigDecimal o2Num = new BigDecimal(o2);

                    return o2Num.compareTo(o1Num);
                }
            };

            //ordena o array em ordem decrescente
            Arrays.sort(arr, comparator);

            //imprime o array
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
