package hello100;

public class Roonie31 {
	public static void main(String[] args) {
		String a ="0123";
		System.out.println(a.concat("Roonie"));
		System.out.println(a);
		System.out.println(a.replace('2', 'k'));
		System.out.println(a);
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());
		sb1.append("1234567890123456789012345678901234");
		System.out.println(sb1.capacity());
	}
}