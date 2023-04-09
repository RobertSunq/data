package book.api;

/**
 * @author: Robert Sun q
 * @date: 2023-04-09 19:03
 * @since: JDK-
 */
public class ThreadApi {

    public static void main(String[] args) {
        System.out.println("Thread API");
    }

    private void api(Thread thread) throws InterruptedException {

        // 构造一个新线程，调用指定目标的 run() 方法
        Thread runable = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("runable");
            }
        });

        // 启动这个线程，从而调用 run() 方法。这个方法会立即返回。新线程会并发运行。
        thread.start();

        // 调用相关 Runable 的 run 方法
        thread.run();

        // 休眠指定的毫秒数
        Thread.sleep(1000L);

        // 等待指定的线程终止
        thread.join();

        // 等待指定的线程终止或者等待经过指定的毫秒数
        thread.join(1000L);

        // 得到这个线程的状态；取值为 NEW、RUNNABLE、BLOCKED、WAITING、TIMED_WAITING 或 TERMINATED
        Thread.State state = thread.getState();

        // 停止该线程。这个方法已经废弃
        thread.stop();

        // 暂停这个线程的执行。这个方法已经废弃
        thread.suspend();

        // 恢复线程。这个方法只能在调用 suspend() 之后使用。这个方法已经废弃。
        thread.resume();

        // 向线程发送中断请求。线程的中断状态将被设置为 true。如果当前该线程被一个 sleep 调用阻塞，则抛出一个 InterruptedException 异常。
        thread.interrupt();

        // 测试当前线程（即正在执行这个指令的线程）是否被中断。注意，这是一个静态方法。这个调用由一个副作用 ———— 它将当前线程的中断状态重置为false
        boolean interrupted = Thread.interrupted();

        // 测试线程是否被中断。与 static interrupted 方法不同，这个调用不改变线程的中断状态。
        boolean interrupted1 = thread.isInterrupted();

        // 返回表示当前正在执行的线程的 Thread 对象
        Thread thread1 = Thread.currentThread();

        // 标识该线程为守护线程或用户线程。这一方法必须在线程启动之前调用
        thread.setDaemon(Boolean.TRUE);

        // 设置未捕获异常的默认处理器
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("set all thread default exception handler");
            }
        });

        // 获取未捕获异常的默认处理器
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();

        // 设置未捕获异常的处理器。如果没有安装处理器，则将线程组对象作为处理器
        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("set one thread exception handler");
            }
        });

        // 获取未捕获异常的处理器。如果没有安装处理器，则将线程组对象作为处理器
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = thread.getUncaughtExceptionHandler();

        // 当线程因为一个未捕获异常而终止时，要记录一个定制报告
        uncaughtExceptionHandler.uncaughtException(new Thread(), new Throwable());

        // 设置线程的优先级。优先级必须在 Thread.MIN_PRIORITY 与 Thread.MAX_PRIORITY之间。一般使用 Thread.NORM_PRIORITY 优先级
        thread.setPriority(Thread.NORM_PRIORITY);

        // 是 Thread 可以有的最小优先级。最小优先级的值为 1
        int minPriority = Thread.MIN_PRIORITY;

        // 是 Thread 的默认优先级。最小优先级的值为 5
        int normPriority = Thread.NORM_PRIORITY;

        // 是 Thread 可以有的最大优先级。最小优先级的值为 10
        int maxPriority = Thread.MAX_PRIORITY;
    }
}
