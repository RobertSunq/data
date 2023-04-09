package book.api;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author: Robert Sun q
 * @date: 2023-04-09 20:14
 * @since: JDK-
 */
public class ThreadLocalRandomApi {

    public static void main(String[] args) {
        System.out.println("ThreadLocalRandom API");
    }

    private void api(ThreadLocalRandom threadLocalRandom) {

        // 返回特定于当前线程的 Random 类的实例。
        ThreadLocalRandom current = ThreadLocalRandom.current();
    }
}
