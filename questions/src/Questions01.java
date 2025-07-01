import java.util.Scanner;

public class Questions01 {
    public static void questions01(){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] s = str.split(" ");
        int length = s[s.length - 1].length();
        System.out.println(length);
    }
}
