import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;


public class HackerRank_NestedLogic {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			Date dt1 = sdf.parse(br.readLine());
			Date dt2 = sdf.parse(br.readLine());
			
			int fine = 0;
			
			if(dt1.compareTo(dt2) > 0) {
				if((dt1.getYear() == dt2.getYear()) && (dt1.getMonth() == dt2.getMonth())) {
					int days = Math.abs(dt1.getDate() - dt2.getDate());
					fine = 15 * days;
				} else if(dt1.getMonth() != dt2.getMonth() && dt1.getYear() == dt2.getYear()) {
					int months = Math.abs(dt1.getMonth() - dt2.getMonth());
					fine = 500 * months;
				} else if(dt1.getYear() != dt2.getYear()) {
					fine = 10000;
				}
			}
			
			System.out.println(fine);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
