package list;

import java.math.BigDecimal;

public class CalcBigDecimal {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		var bd1 = new BigDecimal("0.7");
		var bd2 = new BigDecimal("0.1");
		var bd3 = new BigDecimal("10");
		
		System.out.println(bd1.add(bd2).multiply(bd3));

	}

}
