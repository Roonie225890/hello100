package hello100;

import java.io.File;
import java.io.IOException;

public class Roonie44 {

	public static void main(String[] args) {
		//java.io.File f1 = new java.io.File("c:/test");
		File f1 = new File("dir1/Roonie02.txt");
		if (f1.isFile()){
			System.out.println("OK");
		}else{
			try {
				if (f1.createNewFile()){
					System.out.println("create ok");
				}else{
					System.out.println("create fail");
				}
				
			} catch (IOException e) {
				System.out.println(e.toString());
				e.printStackTrace();
			}
		}
		//System.out.println(f1.getAbsolutePath());
	
	}

}
