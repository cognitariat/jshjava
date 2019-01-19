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
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class DiaryWrite extends JFrame {
	private JTextField noText;
	private JTextField date;
	private JTextField titleText;

	public DiaryWrite() {
		getContentPane().setBackground(Color.GREEN);
		// 컨트롤 + 쉬프트 + f (자동정리)
		setTitle("나의 일기장 작성화면");
		setSize(500, 900);

		FlowLayout flow = new FlowLayout();
		getContentPane().setLayout(flow);

		JLabel lblNewLabel = new JLabel("");
		getContentPane().add(lblNewLabel);
		ImageIcon icon = new ImageIcon("diary2.jpg");
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

		JLabel lblNewLabel_3 = new JLabel("제목");
		lblNewLabel_3.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		getContentPane().add(lblNewLabel_3);

		titleText = new JTextField();
		titleText.setFont(new Font("Arial Unicode MS", Font.BOLD, 18));
		getContentPane().add(titleText);
		titleText.setColumns(25);

		JLabel lblNewLabel_4 = new JLabel("내용");
		lblNewLabel_4.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		getContentPane().add(lblNewLabel_4);

		JTextArea contentText = new JTextArea();
		contentText.setBackground(Color.PINK);
		contentText.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		contentText.setRows(10);
		contentText.setColumns(25);
		getContentPane().add(contentText);

		JButton save = new JButton("저장");
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String noT = noText.getText();
				String titleT = titleText.getText();
				String contentT = contentText.getText();

				// 컨트롤+쉬프트+F(format)
				// 컨트롤+c, 컨트롤+v (복사: 블록잡고)
				try {

					// URL url = new URL("http://www.kb.com");
					// IPAddress("210.125.88.7");

					FileWriter f = new FileWriter("c:/diary/" + noT + ".txt");
					f.write(noT + "\r\n");
					// "\r\n"이 바로 엔터 키 치는걸 나타내는 부분
					f.write(titleT + "\r\n");
					f.write(contentT + "\r\n");
					f.flush();
					f.close();

					noText.setText("");
					titleText.setText("");
					contentText.setText("");

					JOptionPane.showMessageDialog(null, "파일로 저장 성공!!!!");
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "파일로 저장 실패!!!!");
				}

			}
		});
		save.setFont(new Font("맑은 고딕", Font.BOLD, 24));
		save.setBackground(Color.MAGENTA);
		getContentPane().add(save);

		JButton read = new JButton("읽기");
		read.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String noT = noText.getText();
				try {
					FileReader f2 = new FileReader("c:/diary/" + noT + ".txt");
					BufferedReader reader = new BufferedReader(f2);
					String noR = reader.readLine();
					String titleR = reader.readLine();
					String contentR = reader.readLine();
					
					noText.setText(noR);
					titleText.setText(titleR);
					contentText.setText(contentR);
					
					noText.setForeground(Color.RED);
					
					JOptionPane.showMessageDialog(null, "파일로 읽기 성공!!!!");
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "파일로 읽기 실패!!!!");

				}
			}
		});
		read.setFont(new Font("맑은 고딕", Font.BOLD, 24));
		read.setBackground(Color.ORANGE);
		getContentPane().add(read);
		
		JButton button = new JButton("리셋");
		button.setForeground(Color.WHITE);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				noText.setText("");
				titleText.setText("");
				contentText.setText("");				
				JOptionPane.showMessageDialog(null, "초기화 성공!!!!");
			}
		});
		button.setBackground(Color.BLUE);
		button.setFont(new Font("맑은 고딕", Font.BOLD, 24));
		getContentPane().add(button);

		setVisible(true);
	}

	public static void main(String[] args) {
		DiaryWrite diary = new DiaryWrite();

	}

}
