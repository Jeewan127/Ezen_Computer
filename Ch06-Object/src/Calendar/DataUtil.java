package Calendar;
import java.util.Calendar;

public class DataUtil {
	private static DataUtil util = null;
	
	public static DataUtil getInstance() {
		if(util == null) {
			util = new DataUtil();
		}
		
		return util;
	}
	
	private DataUtil() {
		
	}
	
	public static void printDate(Calendar calender) {
		int year = calender.get(Calendar.YEAR);
		int month = calender.get(Calendar.MONTH);
		int day = calender.get(Calendar.DAY_OF_MONTH);
		int hour = calender.get(Calendar.HOUR_OF_DAY);
		int min = calender.get(Calendar.MINUTE);
		int sec = calender.get(Calendar.SECOND);
		
		System.out.printf("%04d�� %02d�� %02d�� %02d�� %02d�� %02d�� \n",
				year, month+1, day, hour, min, sec);
	}
}
