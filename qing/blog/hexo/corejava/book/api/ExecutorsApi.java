package book.api;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * @author: Robert Sun q
 * @date: 2023-04-09 20:44
 * @since: JDK-
 */
public class ExecutorsApi {
    public static void main(String[] args) {
        System.out.println("Executors API");
    }

    private void api(Executors executors) {

        // 返回一个缓存线程池，会在必要的时候创建线程，如果线程已经空闲 60 秒则终止该线程
        ExecutorService executorService = Executors.newCachedThreadPool();

        // 返回一个线程池，使用给定数目的线程执行任务
        ExecutorService executorService1 = Executors.newFixedThreadPool(10);

        // 返回一个执行器，它在一个单独的线程中顺序地执行任务
        ExecutorService executorService2 = Executors.newSingleThreadExecutor();

        // 返回一个线程池，使用给定数目的线程调用任务
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(10);

        // 返回一个执行器，在一个单独的线程中调度任务
        ScheduledExecutorService scheduledExecutorService1 = Executors.newSingleThreadScheduledExecutor();
    }
}
