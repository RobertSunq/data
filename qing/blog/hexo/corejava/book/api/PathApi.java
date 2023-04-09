package book.api;

import java.nio.file.Path;

/**
 * @author: Robert Sunq
 * @date: 2022-07-17 21:46
 * @since: JDK-
 */
public class PathApi {

    public static void main(String[] args) {
        System.out.println("PathApi API");
    }

    private void api(Path path) {

        // 根据给定路径构造一个Path
        Path of = Path.of("my_file.txt");

    }
}
