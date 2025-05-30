package list;

public class drink {

    public static void main(String[] args) {
        String[] names = {"田中", "前田", "鈴木", "中村", "田辺", "浦川", "島田", "岩田"};
        int[] drinks = {7, 0, 2, 4, 3, 0, 0, 6};
        int[] smokes = {60, 10, 0, 20, 10, 0, 30, 0};

        for(int i = 0 ; i < names.length; i++) {
            System.out.printf(names[i]); // 名前を表示

            if(drinks[i] == 0 && smokes[i] == 0) {
                System.out.println("  安全");
            } else if(drinks[i] == 0 && smokes[i] <= 20) {
                System.out.println("  注意");
            } else if(drinks[i] <= 3 && smokes[i] == 0) {
                System.out.println("  注意");
            } else if(drinks[i] <= 3 && smokes[i] <= 20) {
                System.out.println("  要指導");
            } else {
                System.out.println("  要検査");
            } 
        }
    }
}
