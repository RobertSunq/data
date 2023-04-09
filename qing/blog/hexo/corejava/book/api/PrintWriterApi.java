package book.api;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

/**
 * @author: Robert Sunq
 * @date: 2022-07-17 21:46
 * @since: JDK-
 */
public class PrintWriterApi {

    public static void main(String[] args) {
        System.out.println(" API");
    }

    private void api(String str) throws IOException {

        // 构造一个将数据写入文件的 PrintWriter。 文件名由参数指定
        PrintWriter writer = new PrintWriter("myFile.txt", StandardCharsets.UTF_8);
    }

}
