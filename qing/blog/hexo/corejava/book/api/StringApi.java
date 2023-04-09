package book.api;

import java.util.List;
import java.util.stream.IntStream;

/**
 * @author: Robert Sunq
 * @date: 2022-07-14 22:52
 * @since: JDK-11
 */
public class StringApi {

    public static void main(String[] args) {
        System.out.println("String API");
    }

    private void api(String str) {

        String s = new String("s");

        // 返回给定位置的代码单元
        char c = str.charAt(0);

        // 返回指定位置开始的码点
        int i = str.codePointAt(4);

        // 返回从 index = 1 码点开始， codePointOffset = 3 个码点后的码点索引
        int i1 = str.offsetByCodePoints(1, 3);

        // 按照字典序比较，如果字符串在 "123" 之前, 返回一个 负数；在 "123" 之后返回一个 正数； 如果与 "123" 相等 返回 0。
        int i2 = str.compareTo("123");

        // 将这个字符串的码点作为一个 流 返回。 调用 toArray() 将放在一个数组中。
        IntStream intStream = str.codePoints();

        // 用数组从 offset = 1 开始的 count = 3 个码点构造一个字符串
        String s1 = new String(new int[]{1, 2, 3, 4, 5, 6, 7}, 1, 3);

        // 判断字符串 为空
        boolean empty = str.isEmpty();

        // 判断字符串为空或者由空格组成
        boolean blank = str.isBlank();

        // 判断字符串 与 "123" 相等
        boolean equals = str.equals("123");

        // 判断字符串 与 "123AdecDF"(忽略大小写) 相等
        boolean b = str.equalsIgnoreCase("123AdecDF");

        // 判断字符串以 prefix = "123" 开头
        boolean b1 = str.startsWith("123");

        // 判断字符串以 suffix = "123" 结尾
        boolean b2 = str.endsWith("456");

        // 返回字符串中与 "34" 匹配的第一个子串开始的位置， 不存在返回 -1
        int i3 = str.indexOf("34");

        // 从字符串索引 fromIndex = 4 开始返回其中与 "34" 匹配的第一个子串开始的位置， 不存在返回 -1
        int i4 = str.indexOf("34", 4);

        // 返回字符串中与码点 cp = 2 匹配的第一个子串开始的位置， 不存在返回 -1
        int i5 = str.indexOf(2);

        // 从字符串索引 fromIndex = 5 开始返回其中与码点 cp = 2 匹配的第一个子串开始的位置， 不存在返回 -1
        int i6 = str.indexOf(2, 5);

        // 返回字符串中与 "34" 匹配的最后一个子串开始的位置， 不存在返回 -1
        int i7 = str.lastIndexOf("34");

        // 从字符串索引 fromIndex = 4 开始返回其中与 "34" 匹配的最后一个子串开始的位置， 不存在返回 -1
        int i8 = str.lastIndexOf("34", 4);

        // 返回字符串中与码点 cp = 2 匹配的最后一个子串开始的位置， 不存在返回 -1
        int i9 = str.lastIndexOf(2);

        // 从字符串索引 fromIndex = 5 开始返回其中与码点 cp = 2 匹配的最后一个子串开始的位置， 不存在返回 -1
        int i10 = str.lastIndexOf(2, 5);

        // 返回字符串代码单元的个数
        int length = str.length();

        // 返回 startIndex = 2 和 endIndex - 1 = 10 - 1 之间的码点个数
        int i11 = str.codePointCount(2, 10);

        // 返回一个新的字符串，使用 replacement = "43" 替换原始字符串中所有的 target = "34"。 可以使用 String 和 StringBuilder 对象作为 CharSequence 参数
        String replace = str.replace("34", "43");

        // 返回一个新的字符串，是原字符串从 beginIndex = 3 开始到末尾的字符串
        String substring = str.substring(3);

        // 返回一个新的字符串，是原字符串从 beginIndex = 3 开始到 endIndex - 1 = 10 -1 结尾的字符串
        String substring1 = str.substring(3, 10);

        // 返回一个新的字符串，将原字段中的所有大写变为小写
        String s2 = str.toLowerCase();

        // 返回一个新的字符串，将原字段中的所有小写变为大写
        String s3 = str.toUpperCase();

        // 返回一个新的字符串，将原字符串头部和尾部小于等于 U+0020 的字符去除
        String trim = str.trim();

        // 返回一个新的字符串，将原字符串头部和尾部空格去除
        String strip = str.strip();

        // 返回一个新的字符串，使用给定的连接符 delimiter = "," 连接所有的元素
        String join = String.join(",", List.of("1", "2", "3"));

        // 返回一个新的字符串，将当前字符串重复 count = 3 次
        String repeat = str.repeat(3);
    }
}
