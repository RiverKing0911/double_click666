package m8.d7;

/**
 * 输出错误信息与调试信息
 * Created by 王江 on 2017/8/7.
 */
public class PrintErrorAndDebug {
    public static void main(String[] args) {
        System.out.println("程序运行开始！ ");
        //输出异常
        System.err.println("程序运行时手动输出一个异常 ");
        System.err.println("\t程序运行时手动输出两个异常 ");
        System.out.println("PrintErrorAndDebug:main() ");
        System.out.println("main方法结束！ ");
    }
}
