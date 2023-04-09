package book.api;

/**
 * @author: Robert Sunq
 * @date: 2022-07-14 23:01
 * @since: JDK-
 */
public class StringBuilderApi {

    public static void main(String[] args) {
        System.out.println("StringBuilder API");
    }

    private void api(StringBuilder strB) {

        // 效率高于 StringBuffer ， 但是 线程不安全
        StringBuilder stringBuilder = new StringBuilder();

        // 返回构建器或缓冲器中的代码单元数量
        int length = strB.length();

        // 追加一个字符串并返回 this
        StringBuilder append = strB.append("hello");

        // 追加一个代码单元并返回 this
        StringBuilder append1 = stringBuilder.append('!');

        // 追加一个码点，并将其转换为一个或两个代码单元并返回 this
        StringBuilder stringBuilder1 = strB.appendCodePoint(3);

        // 将第 index = 4 个代码单元设置为 ch = '3'
        strB.setCharAt(4, '3');

        // 在 offset = 3 位置插入一个字符串并返回 this
        StringBuilder insert = strB.insert(3, "345");

        // 在 offset = 3 位置插入一个代码单元并返回 this
        StringBuilder v = strB.insert(3, 'v');

        // 删除偏移量从 startIndex = 3 到 endIndex - 1 = 5 - 1 的代码单元并返回 this
        StringBuilder delete = strB.delete(3, 5);

        // 返回一个与构造器或缓冲器内容相同的字符串
        String s = stringBuilder.toString();
    }
}
