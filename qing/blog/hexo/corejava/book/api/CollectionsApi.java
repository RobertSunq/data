package book.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * @author: Robert Sun q
 * @date: 2023-03-19 20:16
 * @since: JDK-
 */
public class CollectionsApi {
    public static void main(String[] args) {
        System.out.println("Collections API");
    }

    private void api(Collections collections) {

        // 使用稳定的排序算法对列表中的元素进行排序。这个算法的时间复杂度是 O( n log n )
        Collections.sort(new ArrayList<Integer>());
        // static <T extends Comparable<? super T>> void sort(List<T> elements)

        // 随机地打乱列表中元素的顺序。这个算法的时间复杂度是 O( n a(a) )， n 是列表的长度，a(n)是访问元素的平均时间
        Collections.shuffle(new ArrayList<>());
        Collections.shuffle(new ArrayList<>(), new Random());

        // 返回集合中最小或最大的元素
        // static <T extends Comparable<? super T>> void min(Collection<T> elements)
        // static <T extends Comparable<? super T>> void max(Collection<T> elements)
        // static <T> min(Collection<T> elements, Comparator<? super T> c)
        // static <T> max(Collection<T> elements, Comparator<? super T> c)

        // 将原列表中的所有元素复制到目标列表的相应位置上。目标列表的长度至少与原列表一样
        // static <T> void copy(List<? super T> to, List<T> from)

        // 将列表中所有位置设置为相同的值
        // static <T> void fill(List<? super T> l, T value)

        // 将所有的值添加到给定的集合中。如果集合改变了，则返回true
        // static <T> boolean addAll(Collection<? super T? c, T... values)

        // 用 newValue 替换所有值为 oldValue 的元素
        // static <T> boolean replaceAll(List<T> l, T oldValue, T newValue)

        // 返回 l 中第一个或最后一个等于 s 的子列表的索引。如果 l 中不存在等于 s 的子列表，则返回 -1.
        // static int indexOfSubList<List<?> l, List<?> s)
        // static int lastIndexOfSubList<List<?> l, List<?> s)

        // 交换给定偏移位置的两个元素
        // static void swap<List<?> l, int i, int j);

        // 逆置列表中元素的顺序。方法的时间复杂度为 O( n )
        // static void reverse(List<?> l);

        // 旋转列表中的元素，将索引 i 的元素移动到位置 (i+d) % l.size(). 方法的时间复杂度为 O( n )
        // static void rotate(List<?> l, int d)

        // 返回 c 中与对象 o 相等的元素个数
        // static int frequency(Collection<?> c, Object o)

        // 如果两个集合没有共同的元素，则返回 true
        // boolean disjoint(Collection<?? c1, Collection<?> c2)

        // 返回一个枚举，可以枚举 c 的元素
        // static <T> Enumeration<T> enumeration(Collection<T> c)

        // 返回一个数组列表，其中包含 e 枚举的元素
        // public static <T> ArrayList<T> list(Enumeration<T> e)

        // 构造集合视图，其方法是同步的
        // static <E> Collection<E> synchronizedCollection(Collection<E> c)
        // static <E> List synchronizedList(List<E> c)
        // static <E> Set synchronizedSet(Set<E> c)
        // static <E> SortedSet synchronizedSortedSet(SortedSet<E> c)
        // static <K, V> Map<K, V> synchronizedMap(Map<K, V> c)
        // static <K, V> SortedMap<K, V> synchronizedSortedMap(SortedMap<K, V> c)
    }
}
