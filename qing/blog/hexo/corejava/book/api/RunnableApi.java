package book.api;

/**
 * @author: Robert Sun q
 * @date: 2023-04-09 19:07
 * @since: JDK-
 */
public class RunnableApi {

    public static void main(String[] args) {
        System.out.println("Runnable API");
    }

    private void api(Runnable runnable) {

        // 必须覆盖这个方法，提供你希望执行的任务指令。
        runnable.run();
    }
}
