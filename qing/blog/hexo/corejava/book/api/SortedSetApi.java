package book.api;

import java.util.Comparator;
import java.util.SortedSet;

/**
 * @author: Robert Sun q
 * @date: 2023-03-16 18:53
 * @since: JDK-
 */
public class SortedSetApi {
    public static void main(String[] args) {
        System.out.println("SortedSet API");
    }

    private <E> void api(SortedSet<E> sortedSet, E e) {

        // 返回用于对元素进行排序的比较器，如果元素用 Comparable 接口的 compareTo 方法进行比较则返回 null
        Comparator<? super E> comparator = sortedSet.comparator();

        // 返回有序集中最小元素或最大元素
        E first = sortedSet.first();
        E last = sortedSet.last();
    }
}
