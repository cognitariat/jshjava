package control;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		//컨트롤+쉬프트+o(오)
		Random r = new Random();
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			int num = r.nextInt(3);
			System.out.println(num);
			sum = sum + num;
		}
		System.out.println(sum);
	}

}
