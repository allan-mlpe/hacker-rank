import java.util.Scanner;

public class HackerRank_JavaInterface {

    interface AdvancedArithmetic {
        int divisor_sum(int n);
    }

    static class MyCalculator implements AdvancedArithmetic {

        @Override
        public int divisor_sum(int n) {
            return getDivisorSum(n);
        }

        private int getDivisorSum(int n) {
            int sum = n;

            for(int i = 1; i <= n/2; i++) {
                if(n % i == 0) sum += i;
            }

            return sum;
        }
    }

    public static void main(String[] args) {
        MyCalculator my_calculator = new MyCalculator();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(my_calculator.divisor_sum(n));
        s.close();
    }
}
