package window2;

import java.util.Scanner;

public class MyShop3 {

	public static void main(String[] args) {
		int price = 5000;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 2개를 입력해주세요.");
		System.out.print("숫자1: ");
		int input1 = sc.nextInt();
		System.out.print("숫자2: ");
		int input2 = sc.nextInt();
		
		Cal2 cal2 = new Cal2();
		int sum = cal2.myCal(input1, input2);
	
		System.out.println("최종 결과는 " + (sum * 100) + "입니다.");		
	
	}

}
