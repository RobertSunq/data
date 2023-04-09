package book.api;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @author: Robert Sun q
 * @date: 2023-04-09 21:37
 * @since: JDK-
 */
public class ProcessBuilderApi {
    public static void main(String[] args) {
        System.out.println("ProcessBuilder API");
    }

    private void api(ProcessBuilder processBuilder) throws IOException {

        // 用给定的命令和参数构造一个进程构造器
        ProcessBuilder processBuilder1 = new ProcessBuilder("/bin/ls", "-l");
        ProcessBuilder processBuilder2 = new ProcessBuilder(List.of("/bin/ls", "-l"));

        // 设置进程的工作目录
        ProcessBuilder directory = processBuilder.directory(new File("/tmp/tmp.log"));

        // 让进程使用虚拟机的标准输入、输出和错误流
        ProcessBuilder processBuilder3 = processBuilder.inheritIO();

        // 如果 redirectErrorStream 为 true，这个进程的标准错误流会与标准输出流合并
        processBuilder.redirectErrorStream(Boolean.TRUE);

        // 将进程的标准输入、输出和错误流重定向到给定的文件
        ProcessBuilder processBuilder4 = processBuilder.redirectInput(new File(""));
        ProcessBuilder processBuilder5 = processBuilder.redirectOutput(new File(""));
        ProcessBuilder processBuilder6 = processBuilder.redirectError(new File(""));

        // 重定向进程的标准输入、输出和错误流
        processBuilder.redirectInput(ProcessBuilder.Redirect.DISCARD);
        ProcessBuilder processBuilder7 = processBuilder.redirectOutput(ProcessBuilder.Redirect.PIPE);
        ProcessBuilder processBuilder8 = processBuilder.redirectError(ProcessBuilder.Redirect.INHERIT);
        // 目标可用是以下参数
        ProcessBuilder.Redirect pipe = ProcessBuilder.Redirect.PIPE; // 默认行为，通过 Process 对象访问
        ProcessBuilder.Redirect inherit = ProcessBuilder.Redirect.INHERIT; // 虚拟机的流
        ProcessBuilder.Redirect discard = ProcessBuilder.Redirect.DISCARD;
        ProcessBuilder.Redirect from = ProcessBuilder.Redirect.from(new File(""));
        ProcessBuilder.Redirect to = ProcessBuilder.Redirect.to(new File(""));
        ProcessBuilder.Redirect redirect = ProcessBuilder.Redirect.appendTo(new File(""));

        // 生成一个可更改的映射， 用于为进程设置环境变量。
        Map<String, String> environment = processBuilder.environment();

        // 启动进程，并生成它的Process对象
        Process start = processBuilder.start();

        // 启动一个进程管线，将各个进程的标准输出连接到下一个进程的标准输入
        // static List<Process> ProcessBuilder.startPipeline(List<ProcessBuilder> builders);
    }
}
