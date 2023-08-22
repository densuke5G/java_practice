package practicepackage;

//import java.util.ArrayList;

//1〜10までの偶数が何個あるのか、偶数の合計は幾つになるかを表示させる問題
public class Quest2 {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		int count = 0;
		int sum = 0;
		for (int num : array) {
			if (num % 2 == 0) {
				count = count + 1;
				sum = sum + num;
			}
		}
		System.out.println("個数：" + count + "合計：" + sum);
	}
}
