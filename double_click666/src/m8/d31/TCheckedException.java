package m8.d31;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * 已检查异常：比如文件无法找到异常FileNotFoundException 网络连接异常IOException 输入输出异常，文件损坏异常
 * 需要进行处理，捕获异常
 * Created by 王江 on 2017/8/31.
 */
public class TCheckedException {
    public static void main(String[] args) {
        printDoing("吃屎");
    }


    private static void printDoing(String msg){
        PrintStream out = System.out;
        try {
            PrintStream ps = new PrintStream("./double_click666/testExceptionLog.txt");
            System.setOut(ps);
            System.out.println(String.format("王江：你在做啥呢?\r武佼龙：%s！", msg));
            System.setOut(out);
            System.out.println("去看看日志文件！");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
