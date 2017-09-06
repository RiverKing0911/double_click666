package m9.d6.demo;

/**
 * 军队
 * 模拟双方的行为
 * Created by Administrator on 2017/9/7.
 */
public class ArmyRunnable implements Runnable {
    //保证了线程可以正确的读取其他线程写入的值
    //可见性
    volatile boolean keepRunning  = true;

    @Override
    public void run() {
        while (keepRunning){
            for (int i=0;i<5;i++){
                System.out.println(Thread.currentThread().getName()+"进攻对方【"+i+"】次");
                //让出线程
                Thread.yield();
            }
        }
        System.out.println(Thread.currentThread().getName()+"结束了攻击");
    }
}
