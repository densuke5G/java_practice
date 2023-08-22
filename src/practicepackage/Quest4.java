package practicepackage;
//要素数20の配列を宣言し、要素に0から5ずつ加算して代入させる。
//[0]~[10]の値の奇数のみカンマ区切りで、[11]~[19]の値は偶数をカンマ区切りで表示させる問題
public class Quest4 {
	public static void main(String[] args) {
		int array[] = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};
		for (int num : array) {
			if (num % 2 == 1 && num < 12) {
				System.out.print(num  + ",");
			}
			else {
				System.out.print(num + "");
			}
			if (num % 2 == 0 && num > 12) {
				System.out.print(num + ",");
			}
			else {
				System.out.print(num + "");
			}
		}
	}
}
