package book.api;

import java.util.Queue;

/**
 * @author: Robert Sun q
 * @date: 2023-03-16 19:07
 * @since: JDK-
 */
public class QueueApi {
    public static void main(String[] args) {
        System.out.println("Queue API");
    }

    private <E> void api(Queue<E> queue, E  e) {

        // 如果队列没有满，将给定的元素添加到这个队列的队尾并返回 true 。 如果队列已满，第一个方法将抛出一个 IllegalStateException，而第二个方法返回 false
        boolean add = queue.add(e);
        boolean offer = queue.offer(e);

        // 如果队列不为空，删除并返回这个队列队头的元素。如果队列时空的，第一个方法抛出 NoSuchElementException ，而第二个方法返回 null
        E remove = queue.remove();
        E poll = queue.poll();

        // 如果队列不为空，返回这个队列队头的元素，但不删除。如果队列空，第一个方法将抛出一个 NoSuchElementException，而第二个方法返回 null
        E element = queue.element();
        E peek = queue.peek();
    }
}
