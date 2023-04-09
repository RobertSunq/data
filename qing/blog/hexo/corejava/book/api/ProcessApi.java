package book.api;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/**
 * @author: Robert Sun q
 * @date: 2023-04-09 21:52
 * @since: JDK-
 */
public class ProcessApi {

    public static void main(String[] args) {
        System.out.println("Process API");
    }

    private void api(Process process) throws InterruptedException {

        // 得到一个流，用于写进程的输入流
        OutputStream outputStream = process.getOutputStream();

        // 得到一个输出流，用于读取进程的输出或错误流
        InputStream inputStream = process.getInputStream();
        InputStream errorStream = process.getErrorStream();

        // 等待进程完成并生成退出值
        int i = process.waitFor();

        // 等待进程完成，不过不能超过给定的超时时间。如果进程退出，则返回 true
        boolean b = process.waitFor(10L, TimeUnit.SECONDS);

        // 返回进程的退出值。按惯例，非 0 的退出值表示一个错误
        int i1 = process.exitValue();

        // 检查这个进程是否仍存活
        boolean alive = process.isAlive();

        // 终止这个进程，可能正常终止，也可能强制终止。
        process.destroy();
        Process process1 = process.destroyForcibly();

        // 检查这个进程是否可用正常终止，或者是否必须强制销毁
        boolean b1 = process.supportsNormalTermination();

        // 生成描述这个进程的 ProcessHandle
        ProcessHandle processHandle = process.toHandle();

        // 生成一个 completableFuture，会在这个进程退出时执行
        CompletableFuture<Process> processCompletableFuture = process.onExit();
    }
}
