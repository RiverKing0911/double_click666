package m6.d28;


import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * 多线程
 * Created by Administrator on 2017/6/27.
 */
public class MoreRun {
    public static void main(String[] args) {
        Runnable hellos = () -> {
            for (int i = 0; i <= 100; i++){
                System.out.println("hello"+i);
            }
        };
        Runnable goodbyes = () ->{
            for (int i = 0; i <= 100; i++){
                System.out.println("goodbyes"+i);
            }
        };

        Executor executor = Executors.newCachedThreadPool();
        executor.execute(hellos);
        executor.execute(goodbyes);
    }
}
