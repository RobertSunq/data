package book.api;

/**
 * @author: Robert Sun q
 * @date: 2023-03-12 22:17
 * @since: JDK-
 */
public class RuntimeExceptionApi {

    public static void main(String[] args) {
        System.out.println("RuntimeException API");
    }

    private void api(RuntimeException runtimeException) {

        // 用给定的 cause（原因） 构造一个 RuntimeException 对象
        RuntimeException runtimeException1 = new RuntimeException(new Throwable());
        RuntimeException errorMessage = new RuntimeException("error message", new Throwable());


    }
}
