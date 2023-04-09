package book.api;

/**
 * @author: Robert Sun q
 * @date: 2022-12-05 1:25
 * @since: JDK-
 */
public class IntegerApi {

    public static void main(String[] args) {
        System.out.println("IntegerApi API");
    }

    private void api(Integer integer) {

        // 将这个Integer对象的值作为一个int返回（覆盖Number类中的intValue方法）。
        int i = integer.intValue();

        // 返回一个新的String对象，表示指定数值 i 的十进制表示。
        String s = Integer.toString(100);

        // 返回数值 i 基于 radix = 2 参数指定进制的表示。
        String s1 = Integer.toString(100, 2);

        // 返回字符串 s = 100 表示的整数， 指定字符串必须表示一个十进制整数。
        int i1 = Integer.parseInt("100");

        // 返回字符串 s = 1000 表示的整数， 指定字符串必须表示一个 radix = 2 进制的整数。
        int i2 = Integer.parseInt("1000", 2);

        // 返回一个新的 Integer 对象， 用字符串 s = "100" 表示的十进制整数初始化。
        Integer integer1 = Integer.valueOf("100");

        // 返回一个新的 Integer 对象， 用字符串 s = "10000" 表示的 radix = 2 进制的整数初始化。
        Integer integer2 = Integer.valueOf("10000", 2);

        // 如果  x = 10 < y  = 30, 返回一个负整数； 如果 x 和 y 相等， 则返回0；否则返回一个正整数。
        int compare = Integer.compare(10, 30);
    }
}
