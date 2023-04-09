package book.api;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.*;
/**
 * @author: Robert Sunq
 * @date: 2022-07-14 23:20
 * @since: JDK-
 */
public class ScannerApi {

    public static void main(String[] args) {
        System.out.println("ScannerApi API");
    }

    private void api(Scanner in) throws IOException {

        // 用给定的输入流 InputStream 创建一个 Scanner 对象
        Scanner scanner = new Scanner(System.in);

        // 构造一个使用给定字符编码从给定路径读取数据的 Scanner
        Scanner scanner1 = new Scanner(Path.of("myFile.txt"), StandardCharsets.UTF_8);

        // 构造一个从给定字符串读取数据的 Scanner
        Scanner scanner2 = new Scanner("123");

        // 读取输入的下一行内容
        String s = in.nextLine();

        // 读取输入的下一个单词 （以空格作为分隔符）
        String next = in.next();

        // 读取并转换下一个表示整数的字符序列
        int i = in.nextInt();

        // 读取并转换下一个表示浮点数的字符序列
        double v = in.nextDouble();

        // 检测输入中是否还有其他单词
        boolean b = in.hasNext();

        // 检测是否还有下一个表示整数的字符序列
        boolean b1 = in.hasNextInt();

        // 检测是否还有下一个表示浮点数的字符序列
        boolean b2 = in.hasNextDouble();
    }
}
