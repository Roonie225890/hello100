package hello100;

public class Roonie41 {

	public static void main(String[] args) {
		int a = 10, b = 3;
		int[] c = {1,2,3};
		try {
			System.out.println(a / b);
			System.out.println(c[2]);
		} catch (ArithmeticException ae) {
			System.out.println("Roonie");
		}catch(ArrayIndexOutOfBoundsException e2){
			System.out.println("III");
		}catch(RuntimeException re){
			System.out.println("Big");



		}
		System.out.println("OK");
	}

}
