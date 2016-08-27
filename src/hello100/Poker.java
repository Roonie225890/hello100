package hello100;

public class Poker {

	public static void main(String[] args) {
		long begin =System.currentTimeMillis();
		System.out.println(begin);
	}
		// 洗牌
		int[] poker = new int[52]; //0,0,....0
		for (int i=0; i<poker.length; i++){
			 int rand;
			 boolean isOK;
			do {
				rand = (int)(Math.random()*poker.length);
			
				// 檢查機制
				isOK = true;
					for (int j=0; j<i; j++){	
					if (poker[j]==rand){
						isOK = false;
						break;
					}
					}
				}while (!isOK);
			
			poker[i] = rand;
			//System.out.println(poker[i]);
		}
				
		//發牌=> 四個玩家
		int[][] player = new int [4][13];
		for (int i=0; i<poker.lenth; i++){
			player[i%4][i/4] = poker[i];
		}
			
		//理牌 => 攤牌
		for (int[] cards : player){
			for (int card : cards){
				System.out.println(card + "  ");
			}
			System.out.println();
}


