package control;

import java.util.Date;
import java.util.Scanner;

public class SwitchTest4 {

	public static void main(String[] args) {
		Date date = new Date();
		
		int month = date.getMonth()+1;
		System.out.println(month + "월");
		
		switch (month) {
		case 2:
			System.out.println("28일까지");
			break;
		case 4:	case 6:	case 9:	case 11:
			System.out.println("30일까지");
			break;
		default:
			System.out.println("31일까지");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
