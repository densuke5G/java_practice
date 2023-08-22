package practicepackage;
//1〜10までの整数をカンマ区切りで横並びで表示（10にはカンマをつけない）させる問題
public class Quest3 {
	public static void main(String[] args) {
		for (int num = 1; num<= 10; num++) {
			System.out.print(num);
				if (num < 10) {
					System.out.print(",");
				}
		}
	}
}
