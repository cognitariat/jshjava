package menu;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//컨트롤 + 쉬프트 + o(영문)
public class ChinaFood extends JFrame {
	private JTextField textField;
	private JTextField textField_1;

	int count = 0;
	final int price = 5000;
	JLabel lblNewLabel_2;
	
	public ChinaFood() {
		getContentPane().setForeground(Color.YELLOW);
		setSize(700, 500);
		setTitle("주문하세요...");
	
		ImageIcon icon = new ImageIcon("중국집.png");
		
		FlowLayout flow = new FlowLayout();
		getContentPane().setLayout(flow);
		
		JButton btnNewButton = new JButton("\uC9DC\uC7A5\uBA74");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				textField.setText(count+"");
				//더하기 연산자는 숫자 + 숫자면 숫자 계산을 하나, 하나라도 문자열이 들어가면 전체를 문자로 만들어버림!
				textField_1.setText(count*price+"");
				ImageIcon icon2 = new ImageIcon("짜장면.jpg");
				lblNewLabel_2.setIcon(icon2);
			}
		});
		btnNewButton.setFont(new Font("Arial Unicode MS", Font.BOLD, 14));
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setForeground(Color.MAGENTA);
		btnNewButton.setToolTipText("\uC9DC\uC7A5\uBA74 \uD558\uB098\uB97C \uCD94\uAC00\uD568");
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uC6B0\uB3D9");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				textField.setText(count+"");
				textField_1.setText(count*price+"");
				ImageIcon icon3 = new ImageIcon("우동.png");
				lblNewLabel_2.setIcon(icon3);
			}
		});
		btnNewButton_1.setBackground(Color.CYAN);
		btnNewButton_1.setFont(new Font("Arial Unicode MS", Font.BOLD, 14));
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setToolTipText("\uC6B0\uB3D9 \uD558\uB098 \uCD94\uAC00");
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uC9EC\uBF55");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				textField.setText(count+"");
				textField_1.setText(count*price+"");
				ImageIcon icon4 = new ImageIcon("짬뽕.jpg");
				lblNewLabel_2.setIcon(icon4);
			}
		});
		btnNewButton_2.setBackground(Color.DARK_GRAY);
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Arial Unicode MS", Font.BOLD, 14));
		btnNewButton_2.setToolTipText("\uC9EC\uBF55 \uD558\uB098 \uCD94\uAC00");
		getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("\uAC1C\uC218");
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial Unicode MS", Font.PLAIN, 20));
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uAE08\uC561");
		getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial Unicode MS", Font.PLAIN, 20));
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel_2 = new JLabel("");
		getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_2.setIcon(icon);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		ChinaFood china = new ChinaFood();
		

	}

}
