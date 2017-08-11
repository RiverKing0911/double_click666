package m7.d14;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Administrator on 2017/7/14.
 */
public class GetDate {

    public static void main(String[] args) {
        ////指定时间输出格式
        //SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        //
        //Date dt = new Date();
        //System.out.println("当前时间：" + sdf.format(dt));
        //
        //Calendar rightNow = Calendar.getInstance();
        //rightNow.setTime(dt);
        //
        //rightNow.add(Calendar.YEAR,-1);//当时日期减1年
        //System.out.println("减1年：" + sdf.format(rightNow.getTime()));
        //
        //rightNow.add(Calendar.MONTH,3);//(在刚才的结果上)再加3个月
        //System.out.println("再加3个月：" + sdf.format(rightNow.getTime()));
        //
        //rightNow.add(Calendar.DAY_OF_YEAR,10);//(在刚才的结果上)再加10天
        //System.out.println("再加10天：" + sdf.format(rightNow.getTime()));
        //
        //
        ////(1) Calendar转化为Date
        //Calendar cal=Calendar.getInstance();
        //Date date=cal.getTime();
        ////(2) Date转化为Calendar
        //Date date1=new Date();
        //Calendar cal1=Calendar.getInstance();
        //cal.setTime(date1);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date(2017-1900,1,5);
        System.out.println(sdf.format(date));

        Calendar calendar = Calendar.getInstance();
        calendar.set(2017,8-1,10);
        calendar.set(Calendar.YEAR,2018);
        System.out.println(sdf.format(calendar.getTime()));


        Date cviExpireDate = new Date();
        Date mliExpireDate = new Date();
        Integer day = 11;
        System.out.println("应跟踪日期为：" + sdf.format(GetDate.getFollowDate(cviExpireDate,mliExpireDate,day)));
    }

    /**
     * 根据传入的时间查询应跟踪日期
     * @param date
     * @param day
     * @return
     */
    private static Date getFollowDate(Date date,Integer day){
        Calendar now = Calendar.getInstance();
        //Date转化为Calendar 用于计算
        Calendar cal=Calendar.getInstance();
        cal.setTime(date);
        //传入时间减去应跟踪时间
        cal.add(Calendar.DAY_OF_YEAR,-day);
        //修改减去后的时间的年为当年
        cal.set(Calendar.YEAR,now.get(Calendar.YEAR));

        //对修改后的时间做判断
        // 如果修改后的时间小于等于当前时间 则表示时间已经过了
        // 如果修改后的时间大于于等于当前时间 则表示时间没过 直接返回修改后的时间
        if(cal.compareTo(now) < 1){
            //将修改后的时间再加上 应跟踪时间 如果还是小于当前时间则表示要在下一年去跟踪了
            //如果时间再次修改后大于当前时间则取现在时间为应跟踪日期
            cal.add(Calendar.DAY_OF_YEAR,day);
            if(cal.compareTo(now) < 1){
                cal.add(Calendar.DAY_OF_YEAR,-day);
                cal.add(Calendar.YEAR,1);
                return cal.getTime();
            } else {
                return now.getTime();
            }
        }else {
            return cal.getTime();
        }
    }



    /**
     * 计算应跟踪日期
     * @param cviExpireDate 交强险到期日期
     * @param mliExpireDate 商业险到期日期
     * @param day 潜客追踪日期
     * @return followDate 应跟踪日期
     */
    private static Date getFollowDate(Date cviExpireDate, Date mliExpireDate, Integer day){
        //计算交强险应跟踪日期
        Date followDateC = getFollowDate(cviExpireDate,day);
        //计算商业险应跟踪日期
        Date followDateM = getFollowDate(mliExpireDate,day);
        //返回时间近的时间作为应跟踪日期
        return followDateC.getTime() > followDateM.getTime() ? followDateM : followDateC;
    }


}
