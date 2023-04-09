package book.api;

import java.util.concurrent.locks.Condition;

/**
 * @author: Robert Sun q
 * @date: 2023-04-09 19:55
 * @since: JDK-
 */
public class ConditionApi {
    public static void main(String[] args) {
        System.out.println("Condition API");
    }

    private void api(Condition condition) throws InterruptedException {

        // 将该线程放在这个条件的等待集中
        condition.await();

        // 解除该条件等待集中所有线程的阻塞状态
        condition.signalAll();

        // 从该条件的等待集中随机选择一个线程，解除其阻塞状态
        condition.signal();
    }
}
