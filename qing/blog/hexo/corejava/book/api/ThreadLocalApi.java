package book.api;

import java.util.function.Supplier;

/**
 * @author: Robert Sun q
 * @date: 2023-04-09 20:09
 * @since: JDK-
 */
public class ThreadLocalApi {
    public static void main(String[] args) {
        System.out.println("ThreadLocal API");
    }

    private <T> void api(ThreadLocal threadLocal) {

        // 得到这个线程的当前值。如果是首次调用 get ， 会调用 initialize 来得到这个值
        threadLocal.get();

        // 为这个线程设置一个新值
        threadLocal.set(new ThreadLocalApi());

        // 删除对应这个线程的值
        threadLocal.remove();

        // 创建一个线程局部变量，其初始值通过调用给定的提供者（supplier）生成。
        ThreadLocal<T> tThreadLocal = ThreadLocal.<T>withInitial(new Supplier<T>() {
            @Override
            public T get() {
                return null;
            }
        });
    }
}
