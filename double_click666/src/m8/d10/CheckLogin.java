package m8.d10;

import java.util.Scanner;

/**
 * 登陆账号密码合法性校验
 * Created by 王江 on 2017/8/10.
 */
public class CheckLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入用户名：");
        String name = scanner.nextLine();
        System.out.print("输入密码：");
        String password = scanner.nextLine();
        if (!"wj".equals(name)) {
            System.out.println("用户名错误");
        } else if (!"123".equals(password)) {
            System.out.println("密码错误");
        } else {
            System.out.println("登陆成功");
        }
    }
}
