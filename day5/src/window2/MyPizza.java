package window2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyPizza {

	JFrame f; //선언! 나 이거 쓸거야~ 어 그래? 그러면 f 쓸만큼 메모리를 준비 (선언의 위치가 사용할 수 잇는 범위가 됨)
	JLabel top, count;
	JButton combo, potato, beef;
	JTextField r;
	int sum = 0;
	int combo2 = 0;
	int potato2 = 0;
	int beef2 = 0;
	
	JTextArea list;
		
	public MyPizza() {
		f = new JFrame();
		f.setSize(600, 400);
		top = new JLabel("<<<<<<<<<<자바 피자에 오신 것을 환영합니다. 피자의 종류를 선택하세요.>>>>>>>>>>");
		combo = new JButton("콤보피자");
		potato = new JButton("포테이토피자");
		beef = new JButton("불고기피자");
		count = new JLabel("개수");
		r = new JTextField(20);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		list = new JTextArea(3, 30);
		f.add(top);
		f.add(combo);
		f.add(potato);
		f.add(beef);
		f.add(count);
		f.add(r);
		f.add(list);
				
		combo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sum++;
				r.setText(sum+"");
				combo2++;
				list.setText("콤보개수: " + combo2 + "개\n"
						     + "포테이토 개수: " + potato2 + "개\n"
						     + "불고기 개수: " + beef2 + "개");
			}
		});
		
		potato.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sum++;
				r.setText(sum+"");
				potato2++;
				list.setText("콤보개수: " + combo2 + "개\n"
					     + "포테이토 개수: " + potato2 + "개\n"
					     + "불고기 개수: " + beef2 + "개");
				}
		});
		
		beef.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sum++;
				r.setText(sum+"");
				beef2++;
				list.setText("콤보개수: " + combo2 + "개\n"
					     + "포테이토 개수: " + potato2 + "개\n"
					     + "불고기 개수: " + beef2 + "개");
			}
		});
		
		
		f.setVisible(true);
		
	}
	public static void main(String[] args) {
		new MyPizza();
	}
	
	
}
