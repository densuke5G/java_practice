package practicepackage;

public class Method {
	public static void main(String[] args) {
        //この下にメソッド呼び出して、出力する
        int num = multi(33, 44);
        System.out.println(num);
    }

    public static int multi(int x, int y) {
        return x * y;
    }
}
