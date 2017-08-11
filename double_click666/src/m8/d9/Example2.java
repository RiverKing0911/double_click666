package m8.d9;

import java.util.Scanner;

/**
 * 位运算升级版
 * Created by 王江 on 2017/8/9.
 */
public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("两个数相乘，请输入第一个数：");
        Long numberA = scanner.nextLong();
        System.out.println("请输入第二个数：");
        Long numberB = scanner.nextLong();
        Long numberC = 0L;
        int i = 0;
        int r;
        int[] a = new int[10];
        do {
            if (numberB % 2 == 1) {
                r = 1;
            } else {
                r = 0;
            }
            a[i] = r;
            numberB = numberB / 2;
            i++;
        } while (numberB > 0);

        for(i=0;i<a.length;i++)
            if (a[i] == 1) {
                numberC += (numberA << i);
            }

        System.out.println(numberC);
    }
}
