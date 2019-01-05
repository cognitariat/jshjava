package array;

public class ArrayTest3 {

	public static void main(String[] args) {
		int[] n = { 100, 200, 300 };
		System.out.println(n[0]);
		System.out.println(n.length);

		// ------------------
		double[] eye = { 0.9, 0.5, 1.5 };
		for (int i = 0; i < eye.length; i++) {
			System.out.println(eye[i]);
		}
		for (double d : eye) {
			System.out.println(d);
		}

		// ------------------
		String[] names = {"김아무개", "박아무개","송아무개"};
		for (String s : names) {
			System.out.println(s);
		}
		System.out.println(names);
		
		System.out.println(names[0] + " " + names[1]);
		
		
		String[] subject = new String[100];
		subject[0] = "hello";
		subject[1] = "java";
		subject[99] = "spring";
		
		//컨트롤+알트+화살표(복사)
		//알트+화살표(이동)
		System.out.println(subject[0]);
		System.out.println(subject[1]);
		System.out.println(subject[99]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
