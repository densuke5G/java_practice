package practicepackage;
import java.util.Scanner;
public class Nextline {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            // ここに、文字列を分割して、出力するコードを書く
             String[] splitline = line.split(",");
             System.out.println(splitline[0] + "が" + splitline[1] + "匹現れた");
        }
    }
}