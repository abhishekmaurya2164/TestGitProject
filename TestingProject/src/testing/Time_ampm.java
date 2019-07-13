package testing;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Time_ampm
{
	public static void main(String[] args) throws Exception {

		Date d= new Date();
		System.out.println(d);
		System.out.println(d.getHours());
		System.out.println(d.getMinutes());
		System.out.println(d.getSeconds());

		SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
       SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ss a");
       Date date = parseFormat.parse("07:30:56 PM");
       System.out.println(displayFormat.format(date));
       System.out.println(parseFormat.format(date) + " = " + displayFormat.format(date));

      

       System.out.println(date.getHours());
       System.out.println(date.getMinutes());
		System.out.println(date.getSeconds());

		
		 SimpleDateFormat simpleDateformat = new SimpleDateFormat("E"); // the day of the week abbreviated
        System.out.println(simpleDateformat.format(d));
 
        simpleDateformat = new SimpleDateFormat("EEEE"); // the day of the week spelled out completely
        System.out.println(simpleDateformat.format(d));
 
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		
		
	}
	
}