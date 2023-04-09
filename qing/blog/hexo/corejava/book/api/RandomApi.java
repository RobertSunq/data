package book.api;

import java.util.Random;

/**
 * @author: Robert Sunq
 * @date: 2022-08-07 23:19
 * @since: JDK-
 */
public class RandomApi {

    public static void main(String[] args) {
        System.out.println(" API");
    }

    private void api(Random random) {

        // 构造一个新的随机数生成器
        Random random1 = new Random();

        // 返回一个 0 ~ n - 1 = 10 -1 之间的随机数
        int i = random.nextInt(10);
    }
}
