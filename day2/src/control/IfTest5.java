package control;

import java.util.Scanner;

public class IfTest5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		이름: park => next()
		System.out.print("이름: ");
		String name = sc.next();
		
//		나이: 30 => nextInt()
		System.out.print("나이: ");
		int age = sc.nextInt();
		
//		혈액형: O => next()
		System.out.print("혈액형: ");
		String blood = sc.next();
		
//		키: 180 => nextInt()
		System.out.print("키: ");
		int height = sc.nextInt();
		
//		몸무게: 88.8 => nextDouble()
		System.out.print("몸무게: ");
		double weight = sc.nextDouble();
		
		System.out.println("===================");
		System.out.println("나의 몸무게는 " + weight);
		System.out.println("나의 키는 " + height);
		System.out.println("나의 혈액형은 " + blood);
		System.out.println("나의 이름은 " + name);
		System.out.println("나의 나이는 " + age);
		
	}

}
