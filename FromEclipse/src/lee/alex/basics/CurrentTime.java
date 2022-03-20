package lee.alex.basics;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTime {

	public static void main(String[] args) {
	
	Date currentDate = new Date();
	
	System.out.println(currentDate);
	
	SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss aa");
	
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
	
	System.out.println(timeFormat.format(currentDate));
	System.out.println(dateFormat.format(currentDate));
	
	SimpleDateFormat dayOfTheWeek = new SimpleDateFormat("EEEEEEEE");
	System.out.println(dayOfTheWeek.format(currentDate));
	
	SimpleDateFormat timeFormatAM = new SimpleDateFormat("h:mm a");
	System.out.println(timeFormatAM.format(currentDate));
		
	
	}	
}
