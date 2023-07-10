package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	
	/** 
	 * @param pattern
	 * @param date
	 * @return String
	 */
	public static String format(String pattern, Date date) {
		
		SimpleDateFormat formateur = new SimpleDateFormat(pattern);
		return formateur.format(date);
	}
	
}
