package hello100;

import javax.swing.JOptionPane;

public class Roonie11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strYear = 
				JOptionPane.showInputDialog("Year");
		String strMonth =
				JOptionPane.showInputDialog("Month");
		int intYear = Integer.parseInt(strYear);
		System.out.println(intYear + "/" + strMonth);
	}

}
