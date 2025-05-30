package list;

public class StrBlank {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		var str1 = "";
		var str2 = " 　\t \n";
		
		System.out.println(str1.isEmpty());
		System.out.println(str1.isBlank());
		System.out.println(str2.isEmpty());
		System.out.println(str1.isBlank());
	}

}
