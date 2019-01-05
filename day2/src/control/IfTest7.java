package control;

import java.util.Scanner;

public class IfTest7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴를 고르세요.");
		System.out.println("1)불고기백반 2)설렁탕 3)고등어조림");
		System.out.println("-----------------------------");
		System.out.print("당신의 선택: ");
		int food = sc.nextInt();
		if(food == 1) {
			System.out.println("불고기 백반을 고르셨군요.!");
		} else if(food == 2){
			System.out.println("설렁탕을 고르셨군요.!");
		} else {
			System.out.println("고등어 조림을 고르셨군요.!");
		}
		
		
		
	}
}
