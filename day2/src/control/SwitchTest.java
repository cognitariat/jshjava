package control;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("좋아하는 스포츠를 선택하세요.");
		System.out.println("수영, 달리기, 코딩");
		System.out.println("-----------------");
		String sports = sc.next();
		
		switch (sports) {
		case "수영":
			System.out.println("수영장으로 가요.");
			//break;
		case "달리기":
			System.out.println("운동장으로 가요.");
			break;
		case "코딩":
			System.out.println("컴퓨터교실로 가요.");
			break;
		default:
			System.out.println("운동안해요.!");
			break;
		}
		
		
		
		
		
		
		
	}

}
