package hello100;
import java.util.Scanner;
public class Roonie07p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Year;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("請輸入年份");
		Year = scanner.nextInt();
		System.out.println("您輸入的年份為" + Year);
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
