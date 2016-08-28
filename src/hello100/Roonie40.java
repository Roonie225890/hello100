package hello100;

public class Roonie40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Roonie401 obj1 = new Roonie401();
		Roonie402 obj2 = new Roonie402();
		Roonie401 obj3 = new Roonie402();
//		Roonie402 obj4 = new Roonie401();
		obj1.m1();
		obj2.m1();
		obj3.m1();
	}

}
class Roonie401 {
	int a = 1;
	void m1(){System.out.println("Roonie401:m1():" + a);}
}
class Roonie402 extends Roonie401 {
	int a = 2;
	void m1(){System.out.println("Roonie402:m1():" + a);}
	void m2(){System.out.println("Roonie402:m2()");}
}