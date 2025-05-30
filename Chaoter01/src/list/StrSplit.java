package list;

public class StrSplit {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		var str1 = "うめ,もも,さくら";
		var result1 = str1.split(",");
		
		System.out.println(String.join("&", result1));
		
		var str2 = "うめ,もも,さくらと杏子";
		var resutl2 = str2.split("[,と]");
		System.out.println(String.join("&", resutl2));
		
		var str3 = "うめ,もも,さくら";
		var resutl3 = str2.split(",");
		System.out.println(String.join("&", resutl3));
		
		
	}

}
