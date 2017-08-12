import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class HackerRank_JavaDateAndTime {
	
	/**
	 * Date pattern used by default
	 */
	private static final String DATE_PATTERN = "MM dd yyyy";
	
	public static Date getDateByFormat(String datePattern, String date) throws ParseException {
		return new SimpleDateFormat(datePattern).parse(date);
	}
	
	public static int getDay(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		return dayOfWeek;
	}
	
	public static String getDayAsString(int day) {
		String dayAsString;
		switch (day) {
		case 1:
			dayAsString = "SUNDAY";
			break;
		case 2:
			dayAsString = "MONDAY";
			break;
		case 3:
			dayAsString = "TUESDAY";
			break;
		case 4:
			dayAsString = "WEDNESDAY";
			break;
		case 5:
			dayAsString = "THURSDAY";
			break;
		case 6:
			dayAsString = "FRIDAY";
			break;
		default:
			dayAsString = "SATURDAY";
			break;
		}
		
		return dayAsString;
	}
	
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String dateString = br.readLine();
			Date date = getDateByFormat(DATE_PATTERN, dateString);
			
			int dayOfWeek = getDay(date);
			String dayAsString = getDayAsString(dayOfWeek);
			
			System.out.println(dayAsString);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
