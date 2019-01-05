package control;

import java.util.Scanner;

public class IfTest8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력1>> ");
		int num1 = sc.nextInt();
		System.out.print("숫자 입력2>> ");
		int num2 = sc.nextInt();
		
		if (num1>num2) {
			System.out.println(num1+"이 더 큽니다.");
		} else {
			System.out.println(num2+"이 더 큽니다.");
		}
	}

}
