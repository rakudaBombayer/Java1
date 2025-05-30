package list;

import java.util.Arrays;

public class CompareArray {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		var data1 = new String[] {"あ", "い", "う"};
		var data2 = new String[] {"あ", "い", "う"};
		
		System.out.println(data1 == data2);
		System.out.println(data1.equals(data2));
		
		System.out.println(Arrays.equals(data1, data2));
	}

}
