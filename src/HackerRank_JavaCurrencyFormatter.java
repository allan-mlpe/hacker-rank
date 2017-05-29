import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.Locale;


public class HackerRank_JavaCurrencyFormatter {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			double value = Double.parseDouble(br.readLine());
			
			String us;
			String india;
			String china;
			String france;
			
			Locale l = new Locale("en", "IN");
			
			NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
			us = nf.format(value);
			
			nf = NumberFormat.getCurrencyInstance(l);
			india = nf.format(value);
			
			nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
			china = nf.format(value);
			
			nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
			france = nf.format(value);
			
			System.out.println(String.format("US: %s", us));
			System.out.println(String.format("India: %s", india));
			System.out.println(String.format("China: %s", china));
			System.out.println(String.format("France: %s", france));
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
