package hello100;

public class Roonie07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Year = 400;
				System.out.println(Year);
				if (Year % 400 == 0) {
					System.out.println("Feb=29days");
				} else if (Year % 100 == 0) {
					System.out.println("Feb=28days");
				} else if (Year % 4 == 0) {
					System.out.println("Feb=29days");
				} else {
					System.out.println("Feb=28days");
				}
	}

}
