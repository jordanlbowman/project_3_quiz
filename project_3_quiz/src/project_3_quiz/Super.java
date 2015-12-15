package project_3_quiz;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Super {
	public static String n;
	public static void progstart(){
		//create a Date to allow program to get current date/time
		//adapted from http://www.tutorialpoints.com/java/java_date_time.htm
		Date dNow = new Date( );
		SimpleDateFormat ft =
		new SimpleDateFormat ("EEEEEEEE MMMMMMM dd, yyyy h:mm:ss a z");
		
		System.out.println("Program start\nRunning " + ft.format(dNow) + "\n"); //print line with date/time in console
		int yes_no = JOptionPane.showConfirmDialog(null, "Welcome! Are you sure you want to do this?",
				 "Dialog", JOptionPane.YES_NO_OPTION); //adapted from https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html
		if(yes_no == JOptionPane.YES_OPTION){ 
			System.out.println("Awesome. Let's do this.");
			Super.name(n);
		}
		else if(yes_no == JOptionPane.NO_OPTION){ 
			System.out.println("Bye. Bye. Bye.");
			System.exit(0);
		}
	}
	
	private static String name (String n){
		n = JOptionPane.showInputDialog("First thing's first. What's your first name?");
		if (n.matches( "[A-Z][a-zA-Z]*" )){ //adapted from http://www.java2s.com/Tutorial/Java/0120__Development/Validatethefirstnameandlastname.htm
			Sub2.favorite();
			Sub1.JFrame_yes();
		}
		else{
			Super.name(n);
		}
		return n;
	}
		
}
