package hello100;

import java.lang.instrument.IllegalClassFormatException;

public class Roonie42 {

	public static void main(String[] args) {
		Bird b1 = new Bird();
		try{
		b1.setLeg(3);
		System.out.println(b1.leg);
		}catch(RuntimeException re){
			System.out.println("CCCCCCCCCCCCCCC");
		}
		
	}

}
class Bird {
	int leg;
	void setLeg(int n){
		if (n<0 || n>2){
			throw new RuntimeException();
		}
		leg = n;
	}
}
class Roonie421{
	void m1(int n) throws IllegalClassFormatException{
		if (n<0){
			throw new IllegalClassFormatException();
		}
	}
}