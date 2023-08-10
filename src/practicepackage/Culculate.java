package practicepackage;

public class Culculate {
	public static void main(String[] args) {
		int slime_qty =(int)(Math.random() * 10 + 1);	// 匹数 1 ～ 10
		System.out.println("体重100キロのスライムが、" + slime_qty + "匹あらわれた。");
		
		int slime_weight = 100;
		System.out.println("スライムの合計体重は、" + (slime_weight * slime_qty) + "キロです。");
	}

}
