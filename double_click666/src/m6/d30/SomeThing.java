package m6.d30;

/**
 * 判断那些代码是错误的
 * Created by Administrator on 2017/6/30.
 */
public class SomeThing {
    private static int i;

    public static void main(String[] args) {
        doSomeThing();
    }

    private static void doSomeThing(){
        System.out.println("i = " + i);
    }

    public static void setI(int i) {
        SomeThing.i = i;
    }
}
