package m8.d10;

/**
 * switch..case 计算折扣
 * Created by 王江 on 2017/8/10.
 */
public class ProductPrice {
    public static void main(String[] args) {
        double money = 1107;
        String out = getPrice(money);
        System.out.println(out);
    }

    private static String getPrice(double money) {
        String rebate = "九九八折";
        if (money > 200) {
            int garde = (int) (money / 200);
            switch (garde) {
                case 1:
                    rebate = "九五折";
                    break;
                case 2:
                    rebate = "九五折";
                    break;
                case 3:
                    rebate = "九折";
                    break;
                case 4:
                    rebate = "八五折";
                    break;
                case 5:
                    rebate = "八折";
                    break;
                case 6:
                    rebate = "七五折";
                    break;
                case 7:
                    rebate = "七折";
                    break;
                case 8:
                    rebate = "六五折";
                    break;
                default:
                    rebate = "六折";
            }
        }
        return "你消费了：" + money + "元," + "将享受" + rebate;
    }
}
