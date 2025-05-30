package list;

public class AutoBoxing {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Long result = 0L;
		
		//1～99の挿話を求める
		for (var i = 1; i < 10000; i++) {
			
			result += i;
		}
		
		System.out.println(result);
	}

}
