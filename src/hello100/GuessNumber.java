package hello100;

import javax.swing.JOptionPane;

public class GuessNumber {

	public static void main(String[] args) {
		//產生謎底
		String answer = createAnswer();
		System.out.println(answer);
		
		for (int i=0; i<10; i++){
			
		
		//開始猜
			String guess = JOptionPane.showInputDialog("猜吧!");
			//比對
			if (guess.equals(answer)){
				//對了 => 恭喜老爺,...
				JOptionPane.showMessageDialog(null, "恭喜老爺,...");
				break;
			}else{
				
				
				
				//錯了 => 提示
				String result = checkAB(answer, guess);
				JOptionPane.showMessageDialog(null, guess + ":" + result);
			}	
		}
	}
	static String checkAB(String a, String g){
		int A, B; A = B = 0;
		for (int i=0; i<g.length(); i++){
			if(g.charAt(i)== a.charAt(i)){
				A++;
			}else if (a.indexOf(g.charAt(i)) != -1){
				B++;
			}
		}
		return A+ "A" + B + "B";
	}
	static String createAnswer(){
		
		int[] number = new int[3];
		int rand;
		boolean isOK;
		for (int i=0; i<number.length; i++){
			do {
				rand = (int)(Math.random()*10);
				isOK = true;
				for (int j=0; j<i; j++){
					if (number[j]==rand){
						isOK = false;
						break;
					}
				}
		
			}while (!isOK);
			number[i] = rand;
			//System.out.println(number[i]);
		}
		String ret = "";
		for (int v : number) ret += v;
		return ret + number[0];
	}


}
