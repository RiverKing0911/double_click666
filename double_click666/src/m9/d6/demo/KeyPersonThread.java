package m9.d6.demo;

/**
 * 将军
 * Created by Administrator on 2017/9/7.
 */
public class KeyPersonThread extends Thread{
    @Override
    public void run() {
        System.out.println(getName()+"开始了战斗");

        for(int i =0;i<10;i++){
            System.out.println(getName()+"半路杀出");
        }
        System.out.println(getName()+"结束了战斗");
    }
}
