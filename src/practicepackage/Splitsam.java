package practicepackage;

public class Splitsam {
	public static void main(String[] args) {
        String team_str = "勇者,戦士,忍者,魔法使い";
        // ここに文字列を分割するコードを記述する
        String[] team_array = team_str.split(",");
        for (String s : team_array ) {
            System.out.println(s);
        }
        String str = "One cold rainy day when my father was a little boy he met an old alley cat on his street";
        // ここに文字列を分割するコードを記述する
        String count[] = str.split(" ");
        System.out.println(count.length);
    }
}
