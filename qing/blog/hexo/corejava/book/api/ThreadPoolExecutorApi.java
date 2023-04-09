package book.api;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author: Robert Sun q
 * @date: 2023-04-09 21:02
 * @since: JDK-
 */
public class ThreadPoolExecutorApi {
    public static void main(String[] args) {
        System.out.println("ThreadPoolExecutor API");
    }

    private void api(ThreadPoolExecutor threadPoolExecutor) {

        // 返回该执行器生命周期中线程池的最大大小
        int largestPoolSize = threadPoolExecutor.getLargestPoolSize();
    }
}
