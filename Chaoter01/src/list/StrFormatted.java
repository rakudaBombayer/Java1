package list;

public class StrFormatted {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		var str = "名前は%1$s, %3$d歳です。%1$sは、元気です。";
		System.out.println(str.formatted("サクラ", "女の子", 1));
		
	}

}
