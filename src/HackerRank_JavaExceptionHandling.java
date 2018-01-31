import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HackerRank_JavaExceptionHandling {

    static class MyCalculator {
        public long power(int n, int p) throws Exception {
            if(n < 0 || p < 0) {
                throw new Exception("n or p should not be negative.");
            } else if(n == 0 && p == 0) {
                throw new Exception("n and p should not be zero.");
            }
            return (long) Math.pow(n, p);
        }
    }

    public static void main(String[] args) {
        MyCalculator c = new MyCalculator();

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line;

            while((line = br.readLine()) != null && !line.isEmpty()) {
                StringTokenizer st = new StringTokenizer(line, " ");
                try {
                    System.out.println(c.power(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
