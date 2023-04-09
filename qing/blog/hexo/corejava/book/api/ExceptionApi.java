package book.api;

/**
 * @author: Robert Sun q
 * @date: 2023-03-12 22:12
 * @since: JDK-
 */
public class ExceptionApi {

    public static void main(String[] args) {
        System.out.println("Exception API");
    }

    private void api(Exception exception) {

        // 用给定的 cause（原因） 构造一个 Exception 对象
        Exception exception1 = new Exception(new Throwable());
        Exception errorMessage = new Exception("error message", new Throwable());
    }
}
