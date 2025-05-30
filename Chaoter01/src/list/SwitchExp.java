package list;

public class SwitchExp {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		var drink = "ビール";
		System.out.println(switch(drink) {
			case "日本酒", "ビール", "ワイン" -> "醸造酒です。";		
				
			case "ブランデー", "ウイスキー" -> "蒸留酒です。";
			
			default -> "不明";				
		});	
	}

}
