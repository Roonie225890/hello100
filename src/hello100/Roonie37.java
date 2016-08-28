package hello100;

public class Roonie37 {

	public static void main(String[] args) {
		final int d = 12;
		System.out.println(Roonie376.a);
		
		
	}

}
interface Roonie371{void m1();}
interface Roonie372{void m2();}
class Roonie373 implements Roonie371, Roonie372 {
	public void m1(){}
	public void m2(){}
	
}
interface Roonie374 extends Roonie371 {
	int a = 10;	//public final
	void m3();  //public
}
interface Roonie375 extends Roonie371, Roonie372 {
	void m3();
}
class Roonie376 implements Roonie375 {
	int b;
	//final int c = 10;
	final int c;
	Roonie376(){c=10;}
	
	@Override
	public void m1() {
		b++;
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}
	
}