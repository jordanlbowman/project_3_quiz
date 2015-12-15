package project_3_quiz;

import javax.swing.JOptionPane;

public class Sub2 extends Super{
	//Variables
	public static String animal;
	public static String state;
	public static String school;
	public static String team;
	public static String [] favorite;
	
	public static void favorite(){
		animal();
		states();
		school();
		NFL_team();
		//compile(team, school, state, animal);
	}
	private static String animal(){
		String[] animals = {
				"Bear","Bunny","Domestic Cat","Human","Labradorca","Zebra"};
		String animal = (String) JOptionPane.showInputDialog(null, "What's your favorite animal?",
				 "Animals?", JOptionPane.QUESTION_MESSAGE, null, animals, animals[3]); 
		 			//creates JOptionPane with a dropdown of animals 
		return animal;
	}

	private static String states(){
		String[] states = { //initializes an array of states
				"Alabama","Alaska","Arizona","Arkansas","California","Colorado","Connecticut","Delaware","Florida","Georgia","Hawaii","Idaho","Illinois","Indiana","Iowa","Kansas","Kentucky","Louisiana","Maine","Maryland","Massachusetts","Michigan","Minnesota","Mississippi","Missouri","Montana","Nebraska","Nevada","New Hampshire","New Jersey","New Mexico","New York","North Carolina","North Dakota","Ohio","Oklahoma","Oregon","Pennsylvania","Rhode Island","South Carolina","South Dakota","Tennessee","Texas","Utah","Vermont","Virginia","Washington","West Virginia","Wisconsin","Wyoming"};
		//adapted from http://www.java2s.com/Tutorial/Java/0240__Swing/Todisplaysadialogwithalistofchoicesinadropdownlistbox.htm
		String state = (String) JOptionPane.showInputDialog(null, "What's your favorite state?",
						 "States?", JOptionPane.QUESTION_MESSAGE, null, states, states[0]); 
				 			//creates JOptionPane with a dropdown of states 
		return state;
	}
	
	private static String school(){
		String[] schools = { //initlializes an array of schools
				"Carroll College","Montana Tech", "University of Montana", "Montana State", "Rocky Mountain College"};
		String school = (String) JOptionPane.showInputDialog(null, "What's your favorite place of higher education in the state of Montana?",
				 "Schools?", JOptionPane.QUESTION_MESSAGE, null, schools, schools[1]);
		return school;
	}
	
	private static String NFL_team(){
		String [] teams = {"Arizona Cardinals", "Atlanta Falcons","Baltimore Ravens","Buffalo Bills","Carolina Panthers","Chicago Bears","Cincinnati Bengals","Cleveland Browns","Dallas Cowboys","Denver Broncos","Detroit Lions","Green Bay Packers","Houston Texans","Indianapolis Colts","Jacksonville Jaguars","Kansas City Chiefs","Miami Dolphins","Minnesota Vikings","New England Patriots","New Orleans Saints","New York Giants","New York Jets","Oakland Raiders","Philadelphia Eagles","Pittsburgh Steelers","San Diego Chargers","San Francisco 49ers","Seattle Seahawks","St. Louis Rams","Tampa Bay Buccaneers","Tennessee Titans","Washington Redskins"};
		String team = (String) JOptionPane.showInputDialog(null, "What is your team?", "Question",
			 	JOptionPane.QUESTION_MESSAGE, null, teams, teams[0]); //JOptionPane with dropdown of NFL Teams
		return team;
	}
	private static String[] compile(String team, String school, String state, String animal){
		String[] favorite = {
				animal,state,school,team};
		return favorite;
	}
	
}
