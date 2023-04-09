package book.api;

import java.util.ListIterator;

/**
 * @author: Robert Sun q
 * @date: 2023-03-16 17:46
 * @since: JDK-
 */
public class ListIteratorApi {

    public static void main(String[] args) {
        System.out.println("ListIterator API");
    }

    private <E> void api(ListIterator<E> listIterator, E e) {

        // 在当前位置前添加一个元素
        listIterator.add(e);

        // 用新元素替换 next 或 previous 访问的上一个元素。如果在上一个 next 或 previous 调用之后列表结构被修改了，将抛出一个 IllegalStateException 异常
        listIterator.set(e);

        // 当反向迭代列表时，如果还有可以访问的元素，返回 true
        boolean b = listIterator.hasPrevious();

        // 返回前一个对象。如果已经到达了列表的头部，就抛出一个 NoSuchElementException 异常
        E previous = listIterator.previous();

        // 返回下一次调用 next 方法时将返回的元素的索引
        int i = listIterator.nextIndex();

        // 返回下一次调用 previous 方法时将返回的元素的索引
        int i1 = listIterator.previousIndex();

    }
}
