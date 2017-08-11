package m8.d9;

import java.util.Scanner;

/**
 * 位运算代替乘法，速度更快
 * Created by 王江 on 2017/8/9.
 */
public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        Long number = scanner.nextLong();
        System.out.println("输入的数字为："+number);
        System.out.println("乘以2："+(number<<1));
        System.out.println("乘以4："+(number<<2));
        System.out.println("乘以8："+(number<<3));
        System.out.println("乘以16："+(number<<4));

        System.out.println("乘以5："+((number<<2)+number));
        System.out.println("乘以6："+((number<<2)+(number<<1)));
    }
}
