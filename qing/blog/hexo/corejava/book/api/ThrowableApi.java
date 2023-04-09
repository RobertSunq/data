package book.api;

/**
 * @author: Robert Sun q
 * @date: 2023-02-02 23:52
 * @since: JDK-
 */
public class ThrowableApi {


    public static void main(String[] args) {
        System.out.println("ThrowableApi API");
    }

    private void api(Throwable cause) {

        // 将 Throwable 对象和堆栈轨迹打印到标准错误流
        cause.printStackTrace();

        //  构造一个新的 Throwable 对象， 但没有详细的描述信息
        Throwable throwable = new Throwable();


        // 构造一个新的 Throwable 对象，带有指定的详细描述信息。按惯例，所有派生的异常类都支持一个默认构造器和一个带有详细描述信息的构造器
        Throwable error = new Throwable("error");

        // 获得 Throwable 对象的详细描述信息
        String message = cause.getMessage();

        // 用给定的 cause（原因） 构造一个Throwable对象
        Throwable throwable1 = new Throwable(cause);
        Throwable errorMessage = new Throwable("error message", cause);

        // 为这个对象设置原因，如果这个对象已经有原因，则抛出一个异常。 返回this
        cause = throwable.initCause(cause);

        // 获得设置为这个对象的原因的异常对象。如果没有设置原因，则返回null
        Throwable cause1 = cause.getCause();

        // 获得构造这个对象时调用堆栈的轨迹
        StackTraceElement[] stackTrace = cause.getStackTrace();

        // 为这个异常增加一个“抑制的”异常，这出现的 try-with-resources语句中，其中 t 是 close 方法抛出的一个异常
        cause.addSuppressed(error);

        // 得到这个异常的所有“抑制的”异常。一般来说，这些是 try-with-resources 语句中 close 方法抛出的异常
        Throwable[] suppressed = cause.getSuppressed();
    }

}
