package book.api;

import java.math.BigInteger;
import java.math.RoundingMode;

/**
 * @author: Robert Sunq
 * @date: 2022-07-18 23:16
 * @since: JDK-
 */
public class BigIntegerApi {

    public static void main(String[] args) {
        System.out.println("BigIntegerApi API");
    }

    private void api(BigInteger bigInteger) {

        // static  返回一个等于 x = 10 的大数
        BigInteger bigInteger1 = BigInteger.valueOf(10);

        // 构造一个大数整数
        BigInteger bigInteger2 = new BigInteger("234509809483295830498583420850");

        // 和
        BigInteger add = bigInteger.add(bigInteger1);

        // 差
        BigInteger subtract = bigInteger.subtract(bigInteger1);

        // 积
        BigInteger multiply = bigInteger.multiply(bigInteger1);

        // 商
        BigInteger divide = bigInteger.divide(bigInteger1);

        // 余数
        BigInteger mod = bigInteger.mod(bigInteger1);

        // 平方根
        BigInteger sqrt = bigInteger.sqrt();

        // 与另一个大整数 other 相比， 相等返回 0 ， 小于 other 返回负数， 大于 other 返回正数。
        int i = bigInteger.compareTo(bigInteger1);
    }
}
