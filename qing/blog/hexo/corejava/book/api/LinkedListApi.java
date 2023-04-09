package book.api;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author: Robert Sun q
 * @date: 2023-03-16 18:00
 * @since: JDK-
 */
public class LinkedListApi {
    public static void main(String[] args) {
        System.out.println("LinkedList API");
    }

    private <E> void api(LinkedList<E> linkedList, E e) {

        // 构造一个空链表
        LinkedList<Long> longs = new LinkedList<>();

        // 构造一个链表，并将集合中所有的元素添加到这个链表中
        LinkedList<Long> longs1 = new LinkedList<>(Arrays.asList(1L, 2L));
        // LinkedList(Collection<? extends E> elements);

        // 将某个元素添加到列表的头部
        linkedList.addFirst(e);

        // 将某个元素添加到列表的尾部
        linkedList.addLast(e);

        // 返回列表头部的元素
        E first = linkedList.getFirst();

        // 返回列表尾部的元素
        E last = linkedList.getLast();

        // 删除并返回列表头部的元素
        E e1 = linkedList.removeFirst();

        // 删除并返回列表尾部的元素
        E e2 = linkedList.removeLast();
    }
}
