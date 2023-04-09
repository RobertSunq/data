package book.api;

import java.util.concurrent.ExecutorService;

/**
 * @author: Robert Sun q
 * @date: 2023-04-09 20:56
 * @since: JDK-
 */
public class ExecutorServiceApi {
    public static void main(String[] args) {
        System.out.println("ExecutorService API");
    }

    private void api(ExecutorService executorService) {

        // 提交指定的任务来执行
        // Future<T> submit(Callable<T> task);
        // Future<T> submit(RUnnable task, T result);
        // Future<?> submit(Runnable task)

        // 关闭服务，完成已经提交的任务但不再接受新的任务
        executorService.shutdown();

        // 执行给定的任务，返回其中一个任务的结果。如果超时，第二个方法会抛出一个 TimeoutException 异常
        // T invokeAny(Collection<Callable<T>> tasks)
        // T invokeAny(Collection<Callable<T>> tasks, long Timeout, TimeUnit unit)

        // 执行给定的任务，返回所有任务的结果。如果超时，第二个方法会抛出一个 TimeoutException 异常
        // List<Future<T>> invokeAll(Collection<Callable<T>> tasks)
        // List<Future<T>> invokeAll(Collection<Callable<T>> tasks, long timeout, TimeUnit unit)
    }
}
