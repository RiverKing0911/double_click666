package m6.d30;

/**
 * 递归方法的使用:
 * 第一个人10岁，往后每一个人增加2岁，求第8个人多少岁
 * Created by Administrator on 2017/6/30.
 */
public class DiGui {
    public static void main(String[] args) {
        System.out.println(computeAge(8));
    }

    private static int computeAge(int n){
        if(n==1){
            return 10;
        }
        return computeAge(n-1)+2;
    }

}
