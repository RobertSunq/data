package book.api;

import java.io.Console;

/**
 * @author: Robert Sunq
 * @date: 2022-07-14 23:23
 * @since: JDK-
 */
public class ConsoleApi {

    public static void main(String[] args) {
        System.out.println(" API");
    }

    private void api(Console console){

        // 显示字符串 fmt = prompt (提示符) 并读取用户输入，直到输入行结束。 后面的 args 参数可以用来提供格式参数
        char[] prompts = console.readPassword("prompt", 0, "23", 90F);

        // 显示字符串 fmt = prompt (提示符) 并读取用户输入，直到输入行结束。 后面的 args 参数可以用来提供格式参数
        String prompt = console.readLine("prompt", 0, "23", 90F);

    }

}
