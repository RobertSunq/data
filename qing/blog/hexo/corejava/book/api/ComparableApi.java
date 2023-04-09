package book.api;

/**
 * @author: Robert Sun q
 * @date: 2023-02-11 16:27
 * @since: JDK-
 */
public class ComparableApi {


    public static void main(String[] args) {
        System.out.println("ComparableApiL<T> API");
    }

    private  void api(Comparable<Integer> comparable) {
        // 用这个对象与 other = 10 进行比较，如果这个对象小于 other 则返回一个负整数；如果相等则返回 0；否则返回一个正整数。
        int i = comparable.compareTo(10);

        // 生成一个比较器，将逆置 Comparable 接口提供的顺序
        // static <T extends Comparable<? super T> Comparator<T> reverseOrder()

        // 生成一个比较器，将逆置这个比较器提供的顺序
        // default Comparator<T> reversed()
    }
}
