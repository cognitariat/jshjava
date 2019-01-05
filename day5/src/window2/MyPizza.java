package window2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Font;

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
	private JLabel label;
	private final JLabel label_1 = new JLabel("총계");
	private JButton btnNewButton;
		
	public MyPizza() { 
		f = new JFrame();
		f.setSize(584, 376);
		top = new JLabel("<<<<<<<<<<자바 피자에 오신 것을 환영합니다. 피자의 종류를 선택하세요.>>>>>>>>>>");
		combo = new JButton("콤보피자");
		potato = new JButton("포테이토피자");
		beef = new JButton("불고기피자");
		count = new JLabel("개수");
		r = new JTextField(20);
		
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		list = new JTextArea(3, 30);
		f.getContentPane().add(top);
		f.getContentPane().add(combo);
		f.getContentPane().add(potato);
		f.getContentPane().add(beef);
		f.getContentPane().add(count);
		f.getContentPane().add(r);
		f.getContentPane().add(list);
		label_1.setForeground(Color.RED);
		f.getContentPane().add(label_1);
		
		btnNewButton = new JButton("나를 눌러요");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "나를 정말 누르셨군요.");
			}
		});
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 14));
		f.getContentPane().add(btnNewButton);
		
		label = new JLabel("");
		f.getContentPane().add(label);
				
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
