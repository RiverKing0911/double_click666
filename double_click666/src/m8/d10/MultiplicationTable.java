package m8.d10;

/**
 * 九九乘法表
 * Created by 王江 on 2017/8/10.
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i=0;i<9;i++){
            for (int j=0;j<=i;j++){
                System.out.print((j+1)+"*"+(i+1)+"="+(i+1)*(j+1)+"\t");
            }
            System.out.println();
        }
    }
}
