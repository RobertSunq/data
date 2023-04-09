package book.api;

import java.util.ArrayDeque;

/**
 * @author: Robert Sun q
 * @date: 2023-03-16 19:26
 * @since: JDK-
 */
public class ArrayDequeApi {
    public static void main(String[] args) {
        System.out.println("ArrayDeque API");
    }

    private <E> void api(ArrayDeque<E> arrayDeque, E  e) {

        // 用初始容量16或给定的初始容量构造一个无限定双端队列
        ArrayDeque<Boolean> booleans = new ArrayDeque<>();
        ArrayDeque<Long> longs = new ArrayDeque<>(32);

    }
}
