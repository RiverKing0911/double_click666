package m8.d9;

import java.util.Scanner;

/**
 * 三目运算判断奇偶
 * Created by 王江 on 2017/8/9.
 */
public class ParityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        long number = scanner.nextLong();
        System.out.println((number % 2 == 1) ? "这是一个奇数" : "这是一个偶数");
    }
}
