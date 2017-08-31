package m8.d31;

/**
 * 运行时异常，不用花时间去捕获它们，要确保不会发生
 * Created by 王江 on 2017/8/31.
 */
public class TRuntimeException {
    public static void main(String[] args) {
        TRunExc(null);
    }

    private static void TRunExc(ADto aDto){
        System.out.println(aDto.getA());
    }
}
