package m9.d6.demo;

/**
 * 舞台
 * Created by Administrator on 2017/9/7.
 */
public class Stage extends Thread {
    @Override
    public void run() {
        System.out.println("kaishi");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ArmyRunnable armyTaskOfWJ = new ArmyRunnable();
        ArmyRunnable armyTaskOfZY= new ArmyRunnable();

        Thread armyOfWJ = new Thread(armyTaskOfWJ,"wangjiang");
        Thread armyOfZY = new Thread(armyTaskOfZY,"zhuyin");

        armyOfWJ.start();
        armyOfZY.start();

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("shenmejiba");

        Thread nb = new KeyPersonThread();
        nb.setName("nb");

        System.out.println("shenmejiba");

        armyTaskOfWJ.keepRunning = false;
        armyTaskOfZY.keepRunning = false;

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        nb.start();;

//        try {
//            armyOfWJ.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        try {
            nb.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("jieshu");
        System.out.println("zaijian");


    }

    public static void main(String[] args) {
        new Stage().start();
    }
}
