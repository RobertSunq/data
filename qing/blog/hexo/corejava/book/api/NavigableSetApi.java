package book.api;

import java.util.Iterator;
import java.util.NavigableSet;

/**
 * @author: Robert Sun q
 * @date: 2023-03-16 19:01
 * @since: JDK-
 */
public class NavigableSetApi {
    public static void main(String[] args) {
        System.out.println("NavigableSet API");
    }

    private <E> void api(NavigableSet<E> navigableSet, E e) {

        // 返回大于 value 的最小元素，如果没有这样的元素就返回 null
        E higher = navigableSet.higher(e);

        // 返回小于 value 的最大元素，如果没有这样的元素就返回 null
        E lower = navigableSet.lower(e);

        // 返回大于等于 value 的最小元素，如果没有这样的元素就返回 null
        E ceiling = navigableSet.ceiling(e);

        // 返回小于等于 value 的最大元素，如果没有这样的元素则返回 null
        E floor = navigableSet.floor(e);

        // 删除并返回这个集中的最大元素或最小元素，这个集为空时返回 null
        E e1 = navigableSet.pollFirst();
        E e2 = navigableSet.pollLast();

        // 返回一个按照递减顺序遍历集中元素的迭代器
        Iterator<E> eIterator = navigableSet.descendingIterator();

    }
}
