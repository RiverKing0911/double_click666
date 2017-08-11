package m8.d7;

import java.util.Scanner;

/**
 * 从控制台接受输入字符
 * Created by 王江 on 2017/8/7.
 */
public class InputCode {
    public static void main(String[] args) {
        //创建输入流扫描器
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你的手机号：");
        //获取你在控制台输入的文本信息
        String dh = scanner.nextLine();
        System.out.println("你的手机号是："+dh);
        System.out.print("再输入你的名字：");
        String name = scanner.nextLine();
        System.out.println("你的名字是："+name);
    }
}
