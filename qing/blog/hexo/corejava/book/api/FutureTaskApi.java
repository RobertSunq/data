package book.api;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author: Robert Sun q
 * @date: 2023-04-09 20:38
 * @since: JDK-
 */
public class FutureTaskApi {
    public static void main(String[] args) {
        System.out.println(" API");
    }

    private <T> void api(FutureTask<T> futureTask) {

        // 构造一个既是 Future<V> 又是 Tunnable 的对象
        FutureTask<String> stringFutureTask = new FutureTask<>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "task";
            }
        });
        FutureTask<Boolean> q = new FutureTask<>(new Runnable() {
            @Override
            public void run() {
                System.out.println("q");
            }
        }, Boolean.TRUE);
    }
}
