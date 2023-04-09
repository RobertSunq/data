package book.api;

import java.util.concurrent.ScheduledExecutorService;

/**
 * @author: Robert Sun q
 * @date: 2023-04-09 21:03
 * @since: JDK-
 */
public class ScheduledExecutorServiceApi {
    public static void main(String[] args) {
        System.out.println("ScheduledExecutorService API");
    }

    private void api(ScheduledExecutorService scheduledExecutorService) {

        // 调度在指定的时间之后执行任务
        // ScheduledFuture<V> schedule(Callable<V> task, long time, TimeUnit unit);
        // ScheduledFuture<V> schedule(Runnable task, long time, TimeUnit unit)

        // 调度在初始延迟之后，周期性地运行给定的任务，周期长度是period个单位
        // ScheduledFuture<V> scheduleAtFixedRate(Runnable task, long initialDelay, long period, TimeUnit unit)

        // 调度在初始延迟之后周期性地运行给定的任务，在一次调用完成和下一次调用开始之间有长度为 delay 个单位的延迟
        // ScheduledFuture<V> scheduleWithFixedDelay(Runnable task, long initialDelay, long delay, TimeUnit unit)
    }
}
