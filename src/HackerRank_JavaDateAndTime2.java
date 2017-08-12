import java.util.Calendar;
import java.util.Scanner;

public class HackerRank_JavaDateAndTime2 {
	
	private static String getDay(int day, int month, int year) {
		Calendar c = Calendar.getInstance();
		c.set(year, month-1, day);
		
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		
		String dayAsString;
		switch (dayOfWeek) {
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
	
	public static String getDay(String day, String month, String year) {
		int dia = Integer.parseInt(day);
        int mes = Integer.parseInt(month);
        int ano = Integer.parseInt(year);
		
		int a = ((12 - mes) / 10);
        int b = ano - a;
        int c = mes + (12 * a);
        int d = b / 100;
        int e = d / 4;
        int f = 2 - d + e;
        int g = (int) (365.25 * b);
        int h = (int) (30.6001 * (c + 1));
        int i = (int) ((f + g) + (h + dia) + 5);
        int j = (int) (i % 7);
        switch (j) {
            case 0:
                return "SATURDAY";
            case 1:
                return "SUNDAY";
            case 2:
                return "MONDAY";
            case 3:
                return "TUESDAY";
            case 4:
                return "WEDNESDAY";
            case 5:
                return "THURSDAY";
            default:
                return "FRIDAY";
        }
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		/*int month = s.nextInt();
		int day = s.nextInt();
		int year = s.nextInt();
		
		System.out.println(getDay(day, month, year));
		*/
		System.out.println(getDay(s.next(), s.next(), s.next()));
		
		s.close();
	}
}
