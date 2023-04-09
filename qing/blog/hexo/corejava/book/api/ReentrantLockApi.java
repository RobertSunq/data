package book.api;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: Robert Sun q
 * @date: 2023-04-09 19:46
 * @since: JDK-
 */
public class ReentrantLockApi {

    public static void main(String[] args) {
        System.out.println("ReentrantLock API");
    }

    private void api(ReentrantLock reentrantLock) {

        // 构造一个重入锁，可以用来保护临界区。
        ReentrantLock reentrantLock1 = new ReentrantLock();

        // 构造一个采用公平策略的锁。一个公平锁倾向于等待时间最长的线程。不过，这种功能保证可能严重影响性能。
        // 所以，默认情况下，不要求锁的公平等
        ReentrantLock reentrantLock2 = new ReentrantLock(Boolean.TRUE);
    }
}
