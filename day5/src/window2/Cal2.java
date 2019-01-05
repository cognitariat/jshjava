package window2;

public class Cal2 {
	
	public int myCal(int x, int y) {
		return x + y + 100;

	}
	
	public void add(int x, int y ) {
		System.out.println("두 수의 합은 " + (x + y));
		
	}
	public void minus(int x, int y ) {
		System.out.println("두 수의 차는 " + (x - y));
		
	}
	
	public int mul(int x, int y ) {
		return x * y;
		
	}
	public void div(int x, int y ) {
		System.out.println("두 수를 나누면 " + (x / y));
}
}