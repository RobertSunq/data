package book.api;

import java.lang.reflect.InvocationHandler;

/**
 * @author: Robert Sun q
 * @date: 2023-03-12 21:47
 * @since: JDK-
 */
public class InvocationHandlerApi {
    public static void main(String[] args) {
        System.out.println("InvocationHandler API");
    }

    private void api(InvocationHandler invocationHandler) {


        // 定义这个方法包含一个动作，你希望只要在代理对象上调用一个方法就完成这个动作
        // Object invocationHandler.invoke(Object proxy, Method method, Object[] args);

    }
}
