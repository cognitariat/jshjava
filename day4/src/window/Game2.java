package window;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Game2 extends JFrame implements ActionListener{

	JButton s, r, p;
	JFrame f;
	
	public Game2() {
		setTitle("나의 가위바위보");
		setSize(500, 1000);
		
		s = new JButton();
		r = new JButton();
		p = new JButton();
		
		ImageIcon icon1 = new ImageIcon("dog.PNG");
		ImageIcon icon2 = new ImageIcon("dog.PNG");
		ImageIcon icon3 = new ImageIcon("dog.PNG");
		
		s.setIcon(icon1);
		r.setIcon(icon2);
		p.setIcon(icon3);
		
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		
		add(s);
		add(r);
		add(p);
		
		Game2 game = new Game2();
		s.addActionListener(game);
		
		r.addActionListener(game);
		
		p.addActionListener(game);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Game2 game = new Game2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Random random = new Random();
		int compuer = random.nextInt(3);
		//0:가위, 1:바위, 2:보
		
		if(e.getSource() == s) {//내가 가위
			if(compuer == 0) { //컴퓨터가 가위
				f.setTitle("비겼음");
			}
			if(compuer == 1) { //컴퓨터가 바위
				f.setTitle("컴퓨터 승");
			}
			if(compuer == 2) { //컴퓨터가 보
				f.setTitle("내가 승");
			}
		}
		
		if(e.getSource() == r) {//내가 바위
			
		}
		if(e.getSource() == p) {//내가 보
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
