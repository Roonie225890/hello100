package hello100;

public class Roonie39 {

	public static void main(String[] args) {
		Roonie391 obj1 = new Roonie391();
		Roonie392 obj2 = new Roonie393();
		Roonie393 obj3 = new Roonie393();
		Roonie393 obj4 = (Roonie393)obj2;
		obj4.m3();
	}

}

class Roonie391 {
	void m1() {
	}
	void m2(){}
}

abstract class Roonie392 {
	Roonie392(){System.out.println("Roonie392");}
	void m1() {
	}
	abstract void m2 ();
	
	
	}
class Roonie393 extends Roonie392{
	void m2(){System.out.println("Roonie:m2()");
		
	}
	void m3(){System.out.println("Roonie:m3()");
	}	
}
final class Roonie394{
	
}