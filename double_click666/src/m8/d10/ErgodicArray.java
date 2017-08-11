package m8.d10;

/**
 * .
 * Created by 王江 on 2017/8/10.
 */
public class ErgodicArray {
    public static void main(String[] args) {
        //创建一个数组
        String[] animal = {"狗", "鸡", "吧", "猪", "猫"};
        int index = 0;
        System.out.print("那个院子里有很多动物，有：");
        while (index < animal.length) {
            System.out.print(animal[index++]);
        }
    }
}
