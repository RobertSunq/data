package book.api;

import java.util.Deque;

/**
 * @author: Robert Sun q
 * @date: 2023-03-16 19:19
 * @since: JDK-
 */
public class DequeApi {
    public static void main(String[] args) {
        System.out.println("Deque API");
    }

    private <E> void api(Deque<E> deque, E e) {

        // 将给定的对象添加到双端队列的队头或队尾，如果这个双端队列已满，前面两个方法将抛出一个 IllegalStateException，而后面的两个方法返回false
        deque.addFirst(e);
        deque.addLast(e);
        boolean b = deque.offerFirst(e);
        boolean b1 = deque.offerLast(e);

        // 如果这个双端队列不为空，删除并返回双端队列队头的元素。如果双端队列为空，前面两个方法将抛出一个 NoSuchElementException，而后面两个方法返回 null
        E e1 = deque.removeFirst();
        E e2 = deque.removeLast();
        E e3 = deque.pollFirst();
        E e4 = deque.pollLast();

        // 如果这个双端队列非空，返回双端队列队头的元素，但不删除。如果双端队列为空，前面两个方法将抛出一个 NoSuchElementException，而后面两个方法返回 null
        E first = deque.getFirst();
        E last = deque.getLast();
        E e5 = deque.peekFirst();
        E e6 = deque.peekLast();

    }
}
