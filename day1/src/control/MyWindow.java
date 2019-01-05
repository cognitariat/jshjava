package control;

import javax.swing.JOptionPane;

public class MyWindow {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("당신의 이름을 입력해주세요.");
		System.out.println("당신이 입력한 이름은 " + name);
		JOptionPane.showMessageDialog(null, name);
	}

}
