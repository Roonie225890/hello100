package hello100;

public class TWID {
	private String id = "A223456789";
	static String check = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
	
	//建構子
	TWID(){
	this((Math.random()*2)==0 ,(int)(Math.random()*26));
	}
	TWID(boolean gender){
		this(gender, (int)(Math.random()*26));
	}
	TWID(int area){
		this((int)(Math.random()*2)==0,area);
	}
	TWID(boolean gender,int area){
//		String c0 = check.substring(area, area-1);
//		String c1 = gender?"1":"2";
//		String c2 = " " + (int)(Math.random()*10);
		
		StringBuffer temp =
				new StringBuffer(check.substring(area, area+1));
		temp.append(gender?"1":"2");
//		id = check.substring(area, area+1);
//		id +=gender?"1":"2";
		for (int i = 0; i<7; i++){
	//	id +="" + (int)(Math.random()*10);
		}
		for (int i = 0;i<10; i++){
			if (isRight(id + i)){
				id = temp.append(i).toString();
				break;
			}
		}
	}
	
	
	TWID(String id){
		this.id = id;
	}
	//傳回身分勝字串
	String getID(){
		return id;
	}
	//傳回性別
	boolean getGender(){
		
		return id.charAt(1) =='1';
		
	}
	//傳回地區
	String getArea(){
		return "台中市";
	}
	//是否正確 =>通過驗證
	static boolean isRight(String testID){
		boolean ret = false;
		if (testID.matches("^[A-Z][12][0-9]{8}$")){
			//("^09[0-9][09]-[0-9]{6}$")
		
		
			//todo 革命尚未成功
			String check = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
			int n12 = check.indexOf(testID.charAt(0))+10;
			int n1 = n12 / 10;
			int n2 = n12 % 10;
			int n3 = Integer.parseInt(testID.substring(1, 2));
			int n4 = Integer.parseInt(testID.substring(2, 3));
			int n5 = Integer.parseInt(testID.substring(3, 4));
			int n6 = Integer.parseInt(testID.substring(4, 5));
			int n7 = Integer.parseInt(testID.substring(5, 6));
			int n8 = Integer.parseInt(testID.substring(6, 7));
			int n9 = Integer.parseInt(testID.substring(7, 8));
			int n10 = Integer.parseInt(testID.substring(8, 9));
			int n11 = Integer.parseInt(testID.substring(9, 10));
			int total = n1*1 +n2*9 + n3*8 + n4*7 + n5*6 + n6*5 + n7*4 + n8*3 + n9*2+ n10*1+n11*1;
			System.out.println(total);
			
			ret = total %10 == 0;
			
		}else{
			ret = false;
	}
		return ret;
	
//	static boolean preCheck(String testID){
//		boolean isOK = false;

//		if (testID.length()==10){
//			if (testID.charAt(1)=='1' || testID.charAt(1)=='2'){
//				
//				//抽出第一碼=>testID.charAT(0)
//				//是否為A-Z=>"ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf();
//			}
			
//		}
//		return true;
	}
}
