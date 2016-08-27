package hello100;

public class Roonie30 {

	public static void main(String[] args) {
		Roonie301 obj1 = new Roonie301(2);
		Roonie302 obj2 = new Roonie302(3);
	}

}
class Roonie301{
//	Roonie301(){
//		System.out.println("A");
//	}
	Roonie301(int a){
		System.out.println("B");
	}
//	Roonie301(byte a){
//		System.out.println("C");
//	}
}
class Roonie302 extends Roonie301{
	Roonie302(){
		//super();
		super(1);
		System.out.println("D");
	}
	Roonie302(int a){
		//super();
		this();
		System.out.println("E");
	}
	Roonie302(String b){
		this(1);
		System.out.println("F");
	}
}