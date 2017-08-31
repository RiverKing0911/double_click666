package m8.d31;

import java.util.Random;

/**
 * 抛出异常.
 * string.format 传入参数.
 * Created by 王江 on 2017/8/31.
 */
public class TException {
    private static Random generator = new Random();

    private static int randInt(int low,int high) throws IllegalAccessException {
        if(low>high){
            throw new IllegalAccessException(String.format("low should be <= high but low is %d and high is %d",low,high));
        }
        return low + (int)(generator.nextDouble()*(high-low+1));
    }

    public static void main(String[] args) throws IllegalAccessException {
        System.out.println(randInt(15,10));
    }
}
