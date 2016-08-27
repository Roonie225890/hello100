package hello100;

public class Roonie32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Roonie321 obj11 = new Roonie321();
		Roonie321 obj12 = new Roonie321();	
		}

}
class Roonie321 {
	int a = 12;
	static {
		System.out.println("Roonie321:static {}:");
	}
	{
		System.out.println("Roonie321:{}:" + ++a);
	}
	Roonie321(){System.out.println("Roonie321()");}
}
class Roonie322 extends Roonie321{
	Roonie322(){
		//super
		System.out.println("Roonie322()");}	
}
class Roonie323 extends Roonie322 {
	Roonie323(){System.out.println("Roonie323()");}
}
