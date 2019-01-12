package inherit;

public class Person {
	//정적특징 - 이름, 나이(변수)
	String name;
	int age;
	
	//동적특징 - 걸어다니다. 웃다. (메소드)
	public void walk() {
		System.out.println("걷다.");
	}
	
	public void smile() {
		System.out.println("웃다.");
	}
	
	
}
