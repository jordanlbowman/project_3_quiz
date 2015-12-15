package project_3_quiz;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Sub1 extends Super{
	
	public static void Jf_yes (){
		JFrame.setDefaultLookAndFeelDecorated(true);
	    JFrame jf = new JFrame("Hello");
	    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    jf.setLayout(new GridLayout(2,4));
	    jf.setPreferredSize(new Dimension(500,500));
	    jf.setLocationRelativeTo(null);
	    JPanel jp = new JPanel();
	    jf.add(jp);
	    jp.add(new JLabel(Sub2.animal));
	    jp.add(new JLabel(new ImageIcon("src/animals/"+Sub2.animal+".jpg")));
	    jp.add(new JLabel(Sub2.state));
	    jp.add(new JLabel(new ImageIcon("src/states/state-"+Sub2.state+".jpg")));
	    jp.add(new JLabel(Sub2.school));
	    jp.add(new JLabel(new ImageIcon("src/school/"+Sub2.school+".jpg")));
	    jp.add(new JLabel(Sub2.team));
	    jp.add(new JLabel(new ImageIcon("src/NFL_logos/"+Sub2.team+".jpg")));		
	}

}
