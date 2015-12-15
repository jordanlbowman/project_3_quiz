package project_3_quiz;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Super {
	
	public static void progstart(){
		//create a Date to allow program to get current date/time
		//adapted from http://www.tutorialpoints.com/java/java_date_time.htm
		Date dNow = new Date( );
		SimpleDateFormat ft =
		new SimpleDateFormat ("EEEEEEEE MMMMMMM dd, yyyy h:mm:ss a z");
		
		System.out.println("Program start\nRunning " + ft.format(dNow) + "\n"); //print line with date/time in console
	}

}
