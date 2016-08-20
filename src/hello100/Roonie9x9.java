package hello100;

public class Roonie9x9 {

	public static void main(String[] args) {
		for (int k = 0; k < 5; k++) {
			for (int j = 1; j <= 9; j++) {
				for (int i = 2; i <= 5; i++) {
					int newi = i + k * 4;
					int r = i * j;
					System.out.print(newi + " x " + j + " = " + r + " \t");

				}
				System.out.println();
			}
			System.out.println("--------------");
		}
	}
}