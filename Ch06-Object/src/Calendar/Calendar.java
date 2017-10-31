package Calendar;

public class Calendar {
	private static Calendar cale = null;
	
	public static Calendar getInstance() {
		if(cale == null) {
			cale = new Calendar();
		}
		
		return cale;
	}
	
	private Calendar() {
		
	}
}
