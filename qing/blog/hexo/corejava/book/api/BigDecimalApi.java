package book.api;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author: Robert Sunq
 * @date: 2022-07-18 23:16
 * @since: JDK-
 */
public class BigDecimalApi {

    public static void main(String[] args) {
        System.out.println("BigDecimalApi API");
    }

    private void api(BigDecimal bigDecimal) {

        // static 返回一个大浮点数
        BigDecimal bigDecimal1 = BigDecimal.valueOf(10);

        // static 返回一个大浮点数 x = 100 / (10 ^ scale = 4) 的大浮点数
        BigDecimal bigDecimal2 = BigDecimal.valueOf(100, 4);

        // 构造一个大浮点数
        BigDecimal bigDecimal3 = new BigDecimal("10.435234523452345");

        // 和
        BigDecimal add = bigDecimal.add(bigDecimal1);

        // 差
        BigDecimal subtract = bigDecimal.subtract(bigDecimal1);

        // 积
        BigDecimal multiply = bigDecimal.multiply(bigDecimal1);

        // 商
        BigDecimal divide = bigDecimal.divide(bigDecimal1);

        // 商 RoundingMode.HALF_UP 四舍五入 当然也还有别的约进
        BigDecimal divide1 = bigDecimal.divide(bigDecimal1, RoundingMode.HALF_UP);

        // 与另一个大浮点数 other 相比， 相等返回 0 ， 小于 other 返回负数， 大于 other 返回正数。
        int i = bigDecimal.compareTo(bigDecimal1);
    }
}
