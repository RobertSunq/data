package book.api;

import java.util.Comparator;
import java.util.SortedMap;

/**
 * @author: Robert Sun q
 * @date: 2023-03-16 21:53
 * @since: JDK-
 */
public class SortedMapApi {
    public static void main(String[] args) {
        System.out.println("SortedMap API");
    }

    private <K,V> void api(SortedMap<K,V> sortedMap, K k, V v) {

        // 返回对键进行排序的比较器。如果键是用 Comparable 接口的 compareTo 方法进行比较， 则返回 null
        Comparator<? super K> comparator = sortedMap.comparator();

        // 返回映射中的最小或最大键
        K k1 = sortedMap.firstKey();
        K k2 = sortedMap.lastKey();
    }
}
