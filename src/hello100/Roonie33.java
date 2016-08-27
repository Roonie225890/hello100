package hello100;

public class Roonie33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Roonie332 obj1 = new Roonie332();
		obj1.m1();
		obj1.m1(1);
		obj1.m2();
	}

}
class Roonie331 {
	int a;
	void m1(){System.out.println("Roonie331:m1()");}
			
	
}
class Roonie332 extends Roonie331 {
//	void m1(){
//		super.m1();
//		System.out.println("Roonie332:m1()");}
	void m1(int a){
		super.m1();
		a++;
		System.out.println("Roonie332:m1(int):" + a);
	}
	void m2(){System.out.println("Roonie332:m2()");}
}
