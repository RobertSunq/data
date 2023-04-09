package book.api;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 * @author: Robert Sun q
 * @date: 2023-03-13 23:35
 * @since: JDK-
 */
public class IteratorApi {
    public static void main(String[] args) {
        System.out.println("Iterator API");
    }

    private void api(Iterator<Integer> iterator) {

        // 如果存在另一个可访问的元素，返回 true
        boolean b = iterator.hasNext();

        // 返回将要访问的下一个对象。如果已经达到了集合的末尾，将抛出一个 NoSuchElementException
        Integer next = iterator.next();

        // 删除上次访问的对象。这个方法必须紧跟在访问一个元素之后执行。如果上次访问之后集合已经发生了变化，这个方法将抛出一个 IllegalStateException
        iterator.remove();

        // 访问元素，并传递到指定的动作，知道再没有更多元素，或者这个动作抛出一个异常
        iterator.forEachRemaining(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        // iterator.forEachRemaining(System.out::println);
    }
}
