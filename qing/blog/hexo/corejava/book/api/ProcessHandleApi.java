package book.api;

import java.time.Duration;
import java.time.Instant;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author: Robert Sun q
 * @date: 2023-04-09 22:00
 * @since: JDK-
 */
public class ProcessHandleApi {
    public static void main(String[] args) {
        System.out.println("ProcessHandle API");
    }

    private void api(ProcessHandle processHandle) {

        // 生成有给定 PID 的进程、所有进程或者虚拟机进程的进程句柄
        // static Optional<ProcessHandle> of(long pid)
        // static Stream<ProcessHandle> allProcesses()
        // static ProcessHandle current()

        // 生成这个进程的子进程或后代进程的进程句柄
        Stream<ProcessHandle> children = processHandle.children();
        Stream<ProcessHandle> descendants = processHandle.descendants();

        // 生成这个进程的 PID
        long pid = processHandle.pid();

        // 生成这个进程的详细信息
        ProcessHandle.Info info = processHandle.info();

        // 生成给定的详细信息（如果可用）
        Optional<String[]> arguments = info.arguments();
        Optional<String> command = info.command();
        Optional<String> s = info.commandLine();
        Optional<Instant> instant = info.startInstant();
        Optional<Duration> duration = info.totalCpuDuration();
        Optional<String> user = info.user();
    }
}
