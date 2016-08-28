package hello100;

public class Roonie35 {

	public static void main(String[] args) {
		Roonie354 car = new Roonie354();
		Roonie352 t1 = new Roonie352();
		Roonie353 t2 = new Roonie353();
		car.m1(t1);
	}

}
interface Roonie351 {
	void m1();
	void m2();
}
class Roonie352 implements Roonie351 {
	public void m1(){System.out.println("Roonie352:m1()");}
	public void m2(){System.out.println("Roonie352:m2()");}
	void m3(){System.out.println("Roonie351:m3()");}
}
class Roonie353 implements Roonie351 {
	public void m1(){System.out.println("Roonie353:m1()");}
	public void m2(){System.out.println("Roonie353:m2()");}
	void m4(){System.out.println("Roonie353:m4()");}
}
class Roonie354 {
	void m1(Roonie351 obj1) {
		obj1.m1();
		obj1.m2();
	}
}