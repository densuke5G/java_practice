package practicepackage;

public class Method2 {
	public static void main(String[] args) {
        for (int count = 1; count <= 9; count++) {
            for (int num = 1; num <= 9; num++) {
                System.out.print(multi(count, num));
                if (num < 9) {
                    System.out.print(", ");
                } else {
                    System.out.println("");
                }
            }
        }
    }

    public static int multi(int x, int y) {
        return x * y;
    }
}
