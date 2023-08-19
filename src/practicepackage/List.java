package practicepackage;

import java.util.ArrayList;

public class List {
	public static void main(String[] args) {
        String[] array = {"戦士","侍","僧侶","魔法使い"};
        // この下で、arrayを出力してみよう
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
	
        String[] enemy = {"スライム", "モンスター", "ゾンビ", "ドラゴン", "魔王"};
        // ここに、要素をループで表示するコードを記述する
        for (int i = 0; i < enemy.length; i ++) {
            System.out.println(enemy[i]);
        }
        String[] enemys = {"スライム", "モンスター", "ゾンビ", "ドラゴン", "魔王"};
        // ここに、要素をループで表示するコードを記述する
        for (String member : enemys){
            System.out.println(member + "が現れた");
        }
        ArrayList<String> team = new ArrayList<String>();

        team.add("勇者");
        team.add("魔法使い");
        for (String membe : team) {
            System.out.println(membe);
        }
    }
}
