package list;

public class SwitchMatch {

    public static void main(String[] args) {
        
        Object obj = -123; // ここで何を代入するかで出力が変わる
        
        switch (obj) {
            case Integer i -> System.out.println(Math.abs(i)); // 絶対値を出力
            case String str -> System.out.println(str.substring(0, 1)); // 文字列の最初の1文字を出力
            case null -> System.out.println("nullです。"); // nullの場合の処理
            default -> System.out.println("意図しない値です。"); // default（スペル修正）
        }
    }
}
