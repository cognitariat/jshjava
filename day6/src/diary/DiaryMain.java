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

public class DiaryMain extends JFrame {
	private JTextField id;
	private JTextField pw;

	public DiaryMain() {
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

		JLabel ID = new JLabel("아이디:");
		ID.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		getContentPane().add(ID);

		id = new JTextField();
		id.setFont(new Font("Arial Unicode MS", Font.BOLD, 18));
		getContentPane().add(id);
		id.setColumns(28);

		JLabel PW = new JLabel("패스워드:");
		PW.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		getContentPane().add(PW);

		pw = new JTextField();
		pw.setFont(new Font("Arial Unicode MS", Font.BOLD, 18));
		getContentPane().add(pw);
		pw.setColumns(28);

		JButton Login = new JButton("로그인");
		Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sId = "root";
				String sPw = "1234";
				String gId = id.getText();
				String gPw = pw.getText();

				if ((sId.equals(gId)) && (sPw.equals(gPw))) {
					JOptionPane.showMessageDialog(null, "로그인에 성공했습니다.");
				} else {
					JOptionPane.showMessageDialog(null, "로그인에 실패했습니다.");
				}
			}
		});
		Login.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		Login.setBackground(Color.MAGENTA);
		getContentPane().add(Login);

		JButton Resetds = new JButton("초기화");
		Resetds.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				id.setText("");
				pw.setText("");
			}
		});
		Resetds.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		Resetds.setBackground(Color.ORANGE);
		getContentPane().add(Resetds);
		

		setVisible(true);
	}

	public static void main(String[] args) {
		DiaryMain diary = new DiaryMain();

	}

}
