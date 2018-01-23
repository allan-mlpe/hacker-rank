import java.util.InputMismatchException;
import java.util.Scanner;

public class HackerRank_JavaExceptionHandlingTryCatch {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            int x = s.nextInt();
            int y = s.nextInt();

            int r = x / y;
            System.out.println(r);
        } catch(ArithmeticException e) {
            System.out.println(e.toString());
        } catch(InputMismatchException e) {
            System.out.println(e.getClass().getName());
        }
        finally {
            s.close();
        }
    }
}
