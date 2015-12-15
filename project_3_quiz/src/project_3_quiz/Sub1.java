package project_3_quiz;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Sub1 extends Super{
		
	public static void Jf_yes (){
		JFrame.setDefaultLookAndFeelDecorated(true);
	    JFrame jf = new JFrame("Hello");
	    //adapted from https://docs.oracle.com/javase/tutorial/uiswing/components/label.html
	    jf.add(new JLabel(Sub2.favorite[0],JLabel.CENTER));	 
	    jf.add(new JLabel(new ImageIcon("src/animals/"+Sub2.favorite[0]+".jpg")));
	    jf.add(new JLabel(Sub2.favorite[1],JLabel.CENTER));
	    jf.add(new JLabel(new ImageIcon("src/states/state-"+Sub2.favorite[1]+".png")));
	    jf.add(new JLabel(Sub2.favorite[2],JLabel.CENTER));
	    jf.add(new JLabel(new ImageIcon("src/school/"+Sub2.favorite[2]+".jpg")));
	    jf.add(new JLabel(Sub2.favorite[3],JLabel.CENTER));
	    jf.add(new JLabel(new ImageIcon("src/NFL_logos/"+Sub2.favorite[4])));
	    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    jf.setLayout(new GridLayout(0,2));
	    //adapted from https://docs.oracle.com/javase/tutorial/uiswing/layout/grid.html
	    jf.setMinimumSize(new Dimension(400,600));
	    jf.setLocationRelativeTo(null);
	    jf.setVisible(true);
	    //System.out.println(Super.n);
	}
	public static void print() {
		//adapted from http://www.mkyong.com/java/how-to-write-to-file-in-java-bufferedwriter-example/
		//write to text file method
		try {

			FileWriter fw = new FileWriter("fileout.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(Sub2.favorite[0] + ", ");
			bw.write(Sub2.favorite[1] + ", ");
			bw.write(Sub2.favorite[2] + ", ");
			bw.write(Sub2.favorite[3]);
			bw.close();

			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

