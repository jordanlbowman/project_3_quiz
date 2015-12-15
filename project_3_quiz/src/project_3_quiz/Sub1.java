package project_3_quiz;

import java.awt.*;
import javax.swing.*;

public class Sub1 extends Super{
	
	public static void Jf_yes (){
		JFrame.setDefaultLookAndFeelDecorated(true);
	    JFrame jf = new JFrame("Hello");
	    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    jf.setLayout(new GridLayout(2,4));
	    jf.setPreferredSize(new Dimension(500,500));
	    jf.setLocationRelativeTo(null);
	    jf.add(new JLabel(Sub2.animal));
	    jf.add(new JLabel(new ImageIcon("src/animals/"+Sub2.animal+".jpg")));
	    jf.add(new JLabel(Sub2.state));
	    jf.add(new JLabel(new ImageIcon("src/states/state-"+Sub2.state+".jpg")));
	    jf.add(new JLabel(Sub2.school));
	    jf.add(new JLabel(new ImageIcon("src/school/"+Sub2.school+".jpg")));
	    jf.add(new JLabel(Sub2.team));
	    jf.add(new JLabel(new ImageIcon("src/NFL_logos/"+Sub2.team+".jpg")));
	    
		
	}

}
