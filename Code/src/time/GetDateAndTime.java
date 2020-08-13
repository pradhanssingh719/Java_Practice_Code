package time;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class GetDateAndTime {

	public static void main(String[] args) {
		String time = new SimpleDateFormat("dd-MM-yyyy_hh-mm-ss").format(new GregorianCalendar().getTime());
		System.out.println(time);
	}

}
