import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class HackerRank_ExtraLongFactorials {
	public static BigInteger factorial(BigInteger n) {
		if(n.toString().equals("1")) {
			return new BigInteger("1");
		} else {
			BigInteger aux = n.subtract(new BigInteger("1"));
			return n.multiply(factorial(aux));
		}
	}
	
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			BigInteger bi = new BigInteger(br.readLine());
			
			System.out.println(factorial(bi));
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
