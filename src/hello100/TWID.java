package hello100;

public class TWID {
	private String id = "A223456789";
	
	//建構子
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
			ret = true;
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
