package book.api;

import java.util.concurrent.Callable;

/**
 * @author: Robert Sun q
 * @date: 2023-04-09 20:29
 * @since: JDK-
 */
public class CallableApi {
    public static void main(String[] args) {
        System.out.println("Callable API");
    }

    private <T> void api(Callable<T> callable) throws Exception {

        // 运行一个将产生结果的任务
        callable.call();
    }
}
