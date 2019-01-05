package window;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyDog {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(600, 600);
		JLabel l = new JLabel();
		ImageIcon icon = new ImageIcon("dog.PNG");
		l.setIcon(icon);
		f.add(l);
		
		
		
		
		
		f.setVisible(true);
		
	}

}
