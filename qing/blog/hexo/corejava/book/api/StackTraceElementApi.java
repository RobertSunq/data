package book.api;

/**
 * @author: Robert Sun q
 * @date: 2023-03-12 22:49
 * @since: JDK-
 */
public class StackTraceElementApi {
    public static void main(String[] args) {
        System.out.println("StackTraceElement API");
    }

    private void api(StackTraceElement stackTraceElement) {

        // 得到包含元素执行点的文件名，如果这个信息不可用则返回null
        String fileName = stackTraceElement.getFileName();

        // 得到包含该元素执行点的源文件的行号，如果这个信息不可用返回 -1。
        int lineNumber = stackTraceElement.getLineNumber();

        // 得到方法包含该元素执行点的类和完全限定名
        String className = stackTraceElement.getClassName();

        // 得到包含该元素执行点的方法的方法名。构造器的方法名为 <init>。 静态初始化器的方法名为 <clinit>。无法区分同名的重载方法。
        String methodName = stackTraceElement.getMethodName();

        // 如果这个元素的执行点在一个原生方法中，则返回 true
        boolean nativeMethod = stackTraceElement.isNativeMethod();

        // 返回一个格式化字符串，包含类和方法名、文件名以及行号
        String s = stackTraceElement.toString();
    }
}
