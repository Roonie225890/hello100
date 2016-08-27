package hello100;

public class Roonie27 {

	public static void main(String[] args) {
		TWID id1 = new TWID(true);
		System.out.println(id1.getID());
		
		if (TWID.isRight("N124810957")){
			System.out.println("OK");
		}else{
			System.out.println("XX");
		}
//		TWID myID = new TWID("A123456789");
//		TWID urID = new TWID("B223456789");
//		System.out.println(myID.getID());
//		System.out.println(myID.getGender()?"男生":"女生");
//		System.out.println(urID.getID());
//		System.out.println(urID.getGender()?"男生":"女生");

	}

}
