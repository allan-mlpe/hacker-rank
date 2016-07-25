import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;



public class HackerRank_JavaBigInteger {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			BigInteger a = new BigInteger(br.readLine());
			BigInteger b = new BigInteger(br.readLine());
			
			BigInteger sum = BigInteger.ZERO;
			//sum = sum.add(a).add(b);
			
			System.out.println(sum.add(a).add(b));
			System.out.println(sum.add(a).multiply(b));
			
		} catch(Exception e) {
			
		}
	}

}
