package book.api;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @author: Robert Sun q
 * @date: 2023-04-09 20:31
 * @since: JDK-
 */
public class FutureApi {

    public static void main(String[] args) {
        System.out.println("Future API");
    }

    private <T> void api(Future<T> future) throws ExecutionException, InterruptedException, TimeoutException {

        // 获得结果，这个方法会阻塞，直到结果可用或者超过了指定的时间。如果不成功，第二个方法会抛出TimeoutException异常
        T t = future.get();
        T t1 = future.get(100L, TimeUnit.SECONDS);

        // 尝试取消这个任务的运行。如果任务已经开始，并且 mayInterrupt = Boolean.TRUE 设置为 true 时，他就会被中断。如果成功执行了取消操作，则返回 true
        boolean cancel = future.cancel(Boolean.TRUE);

        // 如果任务在完成前被取消，则返回 true
        boolean cancelled = future.isCancelled();

        // 如果任务结束，无论时正常完成、中途取消，还是发生异常，否返回 true
        boolean done = future.isDone();
    }
}
