package testing;

import java.util.Date;
public class DayOfDate{
	public static void main(String[] args) throws Exception {

		Date d= new Date();
		System.out.println(d);
		System.out.println(d.getHours());
		System.out.println(d.getMinutes());
		System.out.println(d.getSeconds());
		System.out.println(d.getYear());
		System.out.println(d.getMonth());

		

      


		/*
		 SimpleDateFormat simpleDateformat = new SimpleDateFormat("E"); // the day of the week abbreviated
        System.out.println(simpleDateformat.format(d));
 
        simpleDateformat = new SimpleDateFormat("EEEE"); // the day of the week spelled out completely
        System.out.println(simpleDateformat.format(d));
 
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));*/
		
		
	}


	
}