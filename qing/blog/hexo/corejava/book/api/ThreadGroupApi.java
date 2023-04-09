package book.api;

/**
 * @author: Robert Sun q
 * @date: 2023-04-09 19:31
 * @since: JDK-
 */
public class ThreadGroupApi {

    public static void main(String[] args) {
        System.out.println("ThreadGroup API");
    }

    private void api(ThreadGroup threadGroup) {

        // 如果有父线程组，调用父线程组的这个方法，或者，如果 Thread 类有默认处理器，就调用该处理器，
        // 否则，将栈轨迹打印到标准错误流（不过，如果 e 是一个 ThreadDeath 对象，则会抑制栈轨迹
        // ThreadDeath 对象由已经废弃的 stop 方法产生
        threadGroup.uncaughtException(new Thread(), new Throwable());
    }
}
