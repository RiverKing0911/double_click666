package m8.d10;

import java.util.Scanner;

/**
 * .
 * Created by 王江 on 2017/8/10.
 */
public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个年份");
        long year;
        try {
            year = scanner.nextLong();
            if(year%4==0&&year%100!=0||year%400==0){
                System.out.println("闰年");
            }else {
                System.out.println("平年");
            }
        } catch (Exception e){
            System.out.println("输入的不是正确的年份");
        }
    }
}
