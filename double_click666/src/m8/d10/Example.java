package m8.d10;

import java.util.Scanner;

/**
 * switch..case语句
 * Created by 王江 on 2017/8/10.
 */
public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入姓名");
        String name = scanner.nextLine();
        System.out.println("输入应聘岗位");
        String language = scanner.nextLine();

        switch (language.hashCode()) {
            case 3254818:
            case 2301506:
            case 2269730:
                System.out.println("员工：" + name + "分配到java组");
                break;
            case 3104:
            case 2112:
                System.out.println("员工：" + name + "分配到c#组");
                break;
            case -709190099:
            case 955463181:
            case 9745901:
                System.out.println("员工：" + name + "分配到.net组");
                break;
            default:
                System.out.println("公司不需要" + language + "语言开发人员");
        }
    }
}