package practicepackage;

public class Dice {
	public static void main(String[] args) {
		double rand = Math.random() * 6 + 1;
		int number = (int)rand;
		System.out.println("サイコロの目は" + number + "です");
		
		int number2 = 1234 * 5678 / 2;
		System.out.println(number2);
	}
}
