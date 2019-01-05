package control;

import java.util.Date;
import java.util.Scanner;

public class SwitchTest3 {

	public static void main(String[] args) {
		Date date = new Date();
		
		int month = date.getMonth()+1;
		System.out.println(month + "월");
		
		switch (month) {
		case 11: case 12: case 1: case 2:
			System.out.println("겨울");
			break;
		case 3:	case 4:	case 5:	case 6:
			System.out.println("봄");
			break;
		case 7:	case 8:	case 9:	case 10:
			System.out.println("여름");
			break;
		default:
			System.out.println("가을");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
