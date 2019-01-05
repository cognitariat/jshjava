package control;

import java.util.Scanner;

public class IfTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력해주세요.>> ");
		int input1 = sc.nextInt();
		System.out.println("당신의 입력한 아이디는 " + input1 +"입니다.");
		
		System.out.print("패스워드 입력해주세요.>> ");
		int input2 = sc.nextInt();
		System.out.println("당신의 입력한 패스워드는 " + input2 +"");
		
		if(input1 == 1000 && input2 == 2000){
			System.out.println("로그인OK");
		}else {
			System.out.println("로그인NO");
		}
		
		
		
		
		
	}

}
