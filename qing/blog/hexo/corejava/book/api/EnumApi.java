package book.api;

/**
 * @author: Robert Sun q
 * @date: 2022-12-05 1:35
 * @since: JDK-
 */
public class EnumApi {

    public static void main(String[] args) {
        System.out.println("EnumApi API");
    }

    private void api(Enum en) {

        // 返回给定类中有指定名字的枚举常量。
        Size small = Enum.valueOf(Size.class, "SMALL");

        // 返回枚举常量名
        String s = en.toString();

        // 返回枚举常量在 enum 声明中的位置， 位置从 0 开始计数。
        int ordinal = en.ordinal();

        // 如果枚举常量出现在 other = small 之前， 返回一个负整数； 如果 this == other， 则返回0； 否则， 返回一个正整数。
        // 枚举常量的出现次序在 enum 声明中给出。
        int i = en.compareTo(small);
    }

    enum Size {
        SMALL("s"), MEDIUM("m"), LARGE("l"), EXTRA_LARGE("xl");

        Size(String abbreviation) {
            this.abbreviation = abbreviation;
        }

        private String abbreviation;

        public String getAbbreviation() {
            return abbreviation;
        }
    }
}
