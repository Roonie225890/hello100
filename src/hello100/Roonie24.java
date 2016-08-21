package hello100;

public class Roonie24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike myBike, urBike;
		myBike = new Bike();
		urBike = new Bike();
		System.out.println(myBike.getSpeed());
		System.out.println(urBike.getSpeed());
		
		System.out.println("--------");
		myBike.upSpeed();
		myBike.upSpeed();
		myBike.upSpeed();
		urBike.upSpeed();
		urBike.upSpeed();
		urBike.downSpeed();
		System.out.println("myBike:" + myBike.getSpeed());
		System.out.println("urBike:" + urBike.getSpeed());
		System.out.println("------");
		for (int i=0; i<14; i++)
			myBike.upSpeed();
		System.out.println("myBike:" + myBike.getSpeed());
	}


}
