package hello100;

public class Roonie06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Score = (int) (Math.random() * 101); // 0 - 100
		System.out.println(Score);
		if (Score >= 90) {
			System.out.println("A");
		} else if (Score >= 80) {
			System.out.println("B");
		} else if (Score >= 70) {
			System.out.println("C");
		} else if (Score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("E");
		}

	}
}
