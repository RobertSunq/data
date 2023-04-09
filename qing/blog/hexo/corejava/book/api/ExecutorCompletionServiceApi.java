package book.api;

import java.sql.Time;
import java.util.concurrent.*;

/**
 * @author: Robert Sun q
 * @date: 2023-04-09 21:25
 * @since: JDK-
 */
public class ExecutorCompletionServiceApi {
    public static void main(String[] args) {
        System.out.println("ExecutorCompletionService API");
    }

    private <V> void api(ExecutorCompletionService<V> executorCompletionService) throws InterruptedException {

        // 构造一个执行器完成服务来收集给定执行器的结果
        ExecutorCompletionService<Object> command = new ExecutorCompletionService<>(new Executor() {
            @Override
            public void execute(Runnable command) {
                System.out.println("command");
            }
        });

        // 提交一个任务给底层的处理器
        Future<V> submit = executorCompletionService.submit(new Callable<V>() {
            @Override
            public V call() throws Exception {
                return null;
            }
        });
        // Future<V. submit<Runnable task, V result)

        // 移除下一个已完成的结果，如果没有可用的已完成结果，则阻塞
        Future<V> take = executorCompletionService.take();

        // 移除并返回下一个已完成的结果，如果没有可用的已完成结果，则返回null。第二个方法会等待给定的时间
        Future<V> poll = executorCompletionService.poll();
        Future<V> poll1 = executorCompletionService.poll(100L, TimeUnit.MILLISECONDS);
    }
}
