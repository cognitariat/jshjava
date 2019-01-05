package window2;

public class Dog {

		// TODO Auto-generated method stub
		// 정적특징(상태) => 변수
		// - 꼬리가 있고
		// - 다리갯수는 4개
		boolean tail;
		int leg;
		
		// 동적특징(동작) => 함수(메소드)
		// - 짖다
		// - 꼬리를 흔들다
		public void bark() {
			System.out.println("멍멍!!");
		}
		public void shake() {
			System.out.println("꼬리를 막 흔들다.");
		}

}
