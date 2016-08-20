package hello100;

public class Roonie20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] p = new int[6];//p[0] = 0,p[1] = 0, p[2] = 0;...p[5] = 0;
		for (int i=0; i<100000; i++){
			int point = (int)(Math.random()*9+1);// 1 - 9
			switch(point){
			case 1:
				p[0]++;
				break;
			case 2:
				p[1]++;
				break;
			case 3:
				p[2]++;
				break;
			case 4:
				p[3]++;
				break;
			case 5:
				p[4]++;
				break;
				case 6:
					p[5]++;
					break;
			case 7:
				p[3]++;
				break;
			case 8:
				p[4]++;
				break;
			case 9:
				p[5]++;
				break;
			}
			
		}
		for (int i = 0; i<p.length; i++){
			System.out.println((i+1) + ":" + p[i]);
		}
	}

}
