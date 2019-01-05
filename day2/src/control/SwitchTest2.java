package control;

import java.util.Date;
import java.util.Scanner;

public class SwitchTest2 {

	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
		System.out.println(hour + "시");
		System.out.println(min + "분");
		System.out.println(sec + "초");
		
		int month = date.getMonth()+1;
		System.out.println(month + "월");
		
		int day = date.getDay();
		System.out.println(day);
		
		switch (day) {
		case 0:
			System.out.println("일요일..");
			break;
		case 1:
			System.out.println("월요일..");
			break;
		case 2:
			System.out.println("화요일..");
			break;
		case 3:
			System.out.println("수요일..");
			break;
		case 4:
			System.out.println("목요일..");
			break;
		case 5:
			System.out.println("금요일..");
			break;

		default:
			System.out.println("토요일");
			break;
		}
		
		
		System.out.println(date.getDate());
		System.out.println(date.getYear()+1900);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
