package m8.d7;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * 重定向输出流实现程序日志
 * Created by 王江 on 2017/8/7.
 */
public class RedirectOutputStream {
    public static void main(String[] args) {
        try {
            //保存原输出流
            PrintStream out = System.out;
            //创建文件输出流，文件保存在该double_click666路径下
            PrintStream ps = new PrintStream("./double_click666/log.txt");
            //设置使用新的输出流  还可以 serErr serIn
            System.setOut(ps);
            int age = 18;
            System.out.println("年龄定义为：18");
            String sex = "女";
            System.out.println("性别定义为：女");
            String info = "我是一个"+sex+"孩子，现在"+age+"岁了！";
            System.out.println("整合后的输出是："+info);
            //恢复原有的输出流
            System.setOut(out);
            //输出到控制台
            System.out.println("执行完毕，请看日志文件。");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
