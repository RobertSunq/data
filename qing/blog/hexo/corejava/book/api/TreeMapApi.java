package book.api;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author: Robert Sun q
 * @date: 2023-03-16 21:44
 * @since: JDK-
 */
public class TreeMapApi {
    public static void main(String[] args) {
        System.out.println("TreeMap API");
    }

    private <K,V> void api(TreeMap<K,V>  treeMap, K k, V v) {

        // 为实现 Comparable 接口的键构造一个空的树映射
        TreeMap<K, V> kvTreeMap = new TreeMap<>();

        // 构造一个树映射，并使用一个指定的比较器对键进行排序
        TreeMap<Long, Long> longLongTreeMap = new TreeMap<>(new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                return Long.compare(o1, o2);
            }
        });
        TreeMap<Long, Long> longLongTreeMap1 = new TreeMap<>(Long::compare);

        // 构造一个树映射，并将某个映射中的所有映射条目添加到树映射中
        TreeMap<K, V> kvTreeMap1 = new TreeMap<>(treeMap);

        // 构造一个树映射，将某个有序映射中的所有映射条目添加到树映射中，并使用与给定的有序映射相同的比较器
        // TreeMap(SortedMap<? extends K, ? extends V> entries)

    }
}
