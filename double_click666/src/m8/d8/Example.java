package m8.d8;

import java.util.Scanner;

/**
 * 位运算，做加密
 * Created by 王江 on 2017/8/8.
 */
public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入");
        String password = scanner.nextLine();
        char[] array = password.toCharArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) (array[i] ^ 20000);
        }
        System.out.print("加密后：");
        System.out.println(new String(array));
    }
}
