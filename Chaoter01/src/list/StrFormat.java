package list;

import java.time.LocalDateTime;

public class StrFormat {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        
        System.out.println(String.format(
                "%sは%s,%d歳です。", "サクラ","女の子", 1));
        
        System.out.println(String.format("名前は%1$s, %3$d歳です。%1$sは元気です。", "サクラ", "女の子", 1));

        System.out.println(String.format("%5sです。", "サクラ"));
        System.out.println(String.format("%-5sです。", "サクラ"));
        System.out.println(String.format("%2sです。", "サクラ"));

        // 数値フォーマット
        System.out.println(String.format("%10進数 %08d", 12345));
        System.out.println(String.format("%16進数 %#x", 10));

        // 小数点・指数表記
        System.out.println(String.format("%.2f", 123.456));
        System.out.println(String.format("%.2e", 123.456));
        System.out.println(String.format("%.2E", 123.456));

        var d = LocalDateTime.now();

        // 日付フォーマット
        System.out.println(String.format("%tF", d));
        System.out.println(String.format("%tT", d)); // 修正: 時刻を表示

        System.out.printf("%.2sです。\n", "サクラ");
    }
}
