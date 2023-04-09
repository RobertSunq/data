package book.api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author: Robert Sun q
 * @date: 2023-03-16 18:35
 * @since: JDK-
 */
public class TreeSetApi {
    public static void main(String[] args) {
        System.out.println("TreeSet API");
    }

    private <E> void api(TreeSet<E> treeSet, E e) {

        // 构造一个空树集
        TreeSet<Double> doubles = new TreeSet<>();
        TreeSet<Object> objects = new TreeSet<>(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return o1.hashCode() - o2.hashCode();
            }
        });
        // TreeSet(Comparator<? super E> comparator)

        // 构造一个树集，并增加集合中的所有元素
        TreeSet<Integer> integers = new TreeSet<>(Arrays.asList(10, 22));
        // TreeSet(Collection<? extends E> elements)

        //  构造一个树集，并增加有序集中的所有元素， 这两者之间要使用同样的顺序
        TreeSet<E> es = new TreeSet<>(treeSet);
        // TreeSet(SortedSet<E> s)
    }
}
