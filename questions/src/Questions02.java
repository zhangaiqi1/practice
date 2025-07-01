import java.util.Scanner;

public class Questions02 {

    public static void questions01() {
        // 法1: 将s和c均大小或者小写然后循环比较
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toLowerCase();
        char s = scanner.nextLine().toLowerCase().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == s) {  // 这里因为是char类型，可以用==，而两个String类型需要.equals()

                count++;
            }
        }
        System.out.println(count);
    }

    public static void questions02(){
        // 方法2： 通过将s里的c替换为”“后，比较前后字符缺失的个数
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().toUpperCase();
        String c = sc.nextLine().toUpperCase();
        String s2 = s1.replaceAll(c, "");
        System.out.println(s1.length()-s2.length());
    }

}

