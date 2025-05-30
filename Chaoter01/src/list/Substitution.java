package list;

public class Substitution {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		var x = 1;
		var y = x;
		x += 10;
		
		System.out.println(x);
		System.out.println(y);
		
		var builder1 = new StringBuilder("あいう");
		var builder2 = builder1;
		
		builder1.append("えお");
		System.out.println(builder1);
		System.out.println(builder2.toString());
	}

}
