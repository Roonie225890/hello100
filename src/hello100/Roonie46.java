package hello100;

import java.io.File;

public class Roonie46 {

	public static void main(String[] args) {
		File[] roots = File.listRoots();
		for (File root :roots){
			System.out.println(root.getAbsolutePath());
		}
	}

}
