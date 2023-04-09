package book.api;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * @author: Robert Sun q
 * @date: 2023-03-16 16:26
 * @since: JDK-
 */
public class ListApi {
    public static void main(String[] args) {
        System.out.println("List API");
    }

    private <E> void api(List<E> list, E e) {

        // 返回一个列表迭代器，用来访问列表中的元素
        ListIterator<E> eListIterator = list.listIterator();

        // 返回一个列表迭代器，用来访问列表中的元素，第一次调用这个迭代器的next会返回给定索引的元素
        ListIterator<E> eListIterator1 = list.listIterator(10);

        // 再给定位置添加一个元素
        list.add(10,e);

        // 将一个集合中的所有元素添加到给定位置
        list.addAll(10, Arrays.asList(e, e));
        // void addAll(int i, Collection<? extends E> elements);

        // 删除并返回给定位置的元素
        list.remove(e);

        // 获取给定位置的元素
        E e1 = list.get(2);

        // 用一个新元素替换给定位置的元素，并返回原来那个元素
        E set = list.set(11, e);

        // 返回与指定元素相等的元素再列表中第一次出现的位置，如果没有这样的元素将返回 -1
        int i = list.indexOf(e);

        // 返回与指定元素相等的元素再列表中最后一次出现的位置，如果没有这样的元素将返回 -1
        int i1 = list.lastIndexOf(e);

        // 返回给定位置范围内的所有元素的列表视图
        List<E> es = list.subList(10, 20);
        // List<E> subList(int firstIncluded, int firstExcluded);

        // 使用给定比较器对列表排序
        // default void sort(Comparator<? super T> comparator)

        // 对这个列表的所有元素应用这个操作
        // default void replaceAll(UnaryOpreator<E> op)
    }
}
