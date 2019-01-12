package diary;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class DiaryWrite extends JFrame {
	private JTextField noText;
	private JTextField date;
	private JTextField title;

	public DiaryWrite() {
		getContentPane().setBackground(Color.GREEN);
		// 컨트롤 + 쉬프트 + f (자동정리)
		setTitle("나의 일기장 시작화면");
		setSize(500, 730);

		
		FlowLayout flow = new FlowLayout();
		getContentPane().setLayout(flow);
		
		JLabel lblNewLabel = new JLabel("");
		getContentPane().add(lblNewLabel);
		ImageIcon icon = new ImageIcon("diary.jpg");
		lblNewLabel.setIcon(icon);
		
		JLabel Header = new JLabel("나의 일기장");
		Header.setFont(new Font("맑은 고딕", Font.BOLD, 56));
		getContentPane().add(Header);
		
		JLabel lblNewLabel_2 = new JLabel("<<<<<<<<<오늘의 일기 작성을 시작합니다>>>>>>>>>");
		lblNewLabel_2.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		getContentPane().add(lblNewLabel_2);

		JLabel no = new JLabel("번호");
		no.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		getContentPane().add(no);

		noText = new JTextField();
		noText.setFont(new Font("Arial Unicode MS", Font.BOLD, 18));
		getContentPane().add(noText);
		noText.setColumns(25);

		JLabel PW = new JLabel("날짜");
		PW.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		getContentPane().add(PW);

		date = new JTextField();
		date.setFont(new Font("Arial Unicode MS", Font.BOLD, 18));
		getContentPane().add(date);
		date.setColumns(25);

		JButton save = new JButton("저장");
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		JLabel lblNewLabel_3 = new JLabel("제목");
		lblNewLabel_3.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		getContentPane().add(lblNewLabel_3);
		
		title = new JTextField();
		title.setFont(new Font("Arial Unicode MS", Font.BOLD, 18));
		getContentPane().add(title);
		title.setColumns(25);
		
		JLabel lblNewLabel_4 = new JLabel("내용");
		lblNewLabel_4.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		getContentPane().add(lblNewLabel_4);
		
		JTextArea contents = new JTextArea();
		contents.setBackground(Color.PINK);
		contents.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		contents.setRows(10);
		contents.setColumns(25);
		getContentPane().add(contents);
		save.setFont(new Font("맑은 고딕", Font.BOLD, 24));
		save.setBackground(Color.MAGENTA);
		getContentPane().add(save);

		JButton read = new JButton("읽기");
		read.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				noText.setText("");
				date.setText("");
			}
		});
		read.setFont(new Font("맑은 고딕", Font.BOLD, 24));
		read.setBackground(Color.ORANGE);
		getContentPane().add(read);
		

		setVisible(true);
	}

	public static void main(String[] args) {
		DiaryWrite diary = new DiaryWrite();

	}

}
