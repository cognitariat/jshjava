package inherit;

public class SuperMan extends Man {
	//정적특징 - high
	int high;
	
	//동적특징 - fly
	public void fly() {
		run();
		System.out.println("날다.");
	}
}
