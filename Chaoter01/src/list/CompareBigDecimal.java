package list;

import java.math.BigDecimal;

public class CompareBigDecimal {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		var bd1 = new BigDecimal("0.2");
		var bd2 = new BigDecimal("3");
		var bd3 = new BigDecimal("0.6");
		
		System.out.println(bd1.multiply(bd2).compareTo(bd3));
		
	}

}
