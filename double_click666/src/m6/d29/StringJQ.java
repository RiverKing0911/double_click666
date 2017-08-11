package m6.d29;

/**
 * 字符串截取 不能把汉字劈成两半
 * 截取一定长度的字节
 * Created by Administrator on 2017/6/29.
 */
public class StringJQ {
    public static void main(String[] args) throws Exception{
        String s = "ABC我TOM是zt";

        int num = trimGBK(s.getBytes("GBK"),4);
        System.out.println(s.substring(0,num));

    }
    private static int trimGBK(byte[] buf, int n){
        int num = 0;
        boolean beforeIsChinese = false;
        for (int i=0 ;i < n;i++) {
            if(buf[i]<0 && !beforeIsChinese){
                beforeIsChinese = true;
            } else {
                num ++;
                beforeIsChinese = false;
            }
        }
        return num;
    }
}
