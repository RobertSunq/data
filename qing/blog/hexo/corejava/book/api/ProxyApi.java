package book.api;

import java.lang.reflect.Proxy;

/**
 * @author: Robert Sun q
 * @date: 2023-03-12 21:51
 * @since: JDK-
 */
public class ProxyApi {

    public static void main(String[] args) {
        System.out.println("Proxy API");
    }

    private void api(Proxy proxy) {

        // 返回实现指定接口的代理类
        // static Class<?> getProxyClass(ClassLoader loader, Class<?>... interfaces);

        // 构造实现指定接口的代理类的一个新实例。所有方法都调用给定处理器对象的 invoke 方法
        // static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler);

        // 如果 cl 是一个代理类则返回 true
        // static boolean isProxyClass(Class<?> cl);
    }
}
