package m8.d1;

/**
 * Created by Administrator on 2017/8/1.
 */
public class split {
    public static void main(String[] args) {
        String orgStr = "wo,shi,ni,ba,ba";
        String[] sp = orgStr.split(",");
        for (String aSp : sp) {
            System.out.print(aSp+" ");
        }
    }
}
