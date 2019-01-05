package array;

import java.util.Scanner;

public class ArrayTest5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		
		for (int i = 0; i < num.length; i++) {
			System.out.print("점수 입력>> ");
			num[i] = sc.nextInt();
		}
		
		for (int n : num) {
			System.out.println(n);
		}
		
		System.out.print("찾고 싶은 값 입력>> ");
		int find = sc.nextInt();
		for (int i = 0; i < num.length; i++) {
			if(num[i] == find) {
				System.out.println("위치는 " + i);
			}
		}
		
//		int mini = num[0];
		int max = num[0];
		
		for (int i = 0; i < num.length; i++) {
			if(num[i] > max) {
				max = num[i];
			}
		}
		System.out.println("최댓값은 " + max);
		
		
		
		
		
		
		
		
		
	}

}
