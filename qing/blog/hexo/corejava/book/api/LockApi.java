package book.api;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @author: Robert Sun q
 * @date: 2023-04-09 19:44
 * @since: JDK-
 */
public class LockApi {

    public static void main(String[] args) {
        System.out.println("Lock API");
    }

    private void api(Lock lock) {

        // 获得这个锁；如果锁当前被另一个线程占有，则阻塞
        lock.lock();

        // 释放这个锁
        lock.unlock();

        // 返回一个与这个锁相关联的条件对象
        Condition condition = lock.newCondition();
    }
}
