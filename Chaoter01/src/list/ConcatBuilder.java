package list;

public class ConcatBuilder {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		var buildr = new StringBuilder();
		
		for (var i = 0; i <1000; i++) {
			buildr.append("いろは");
		}
		
		var result = buildr.toString();
	}

}
