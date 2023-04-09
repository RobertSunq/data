package book.api;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/**
 * @author: Robert Sun q
 * @date: 2023-03-12 23:20
 * @since: JDK-
 */
public class MethodApi {
    public static void main(String[] args) {
        System.out.println("Method API");
    }

    private void api(Method method) {

        // 如果这个方法被声明为一个泛型方法，则获得泛型类型变量，否则返回长度为 0 的数组
        TypeVariable<Method>[] typeParameters = method.getTypeParameters();

        // 获得这个方法声明的泛型返回类型
        Type genericReturnType = method.getGenericReturnType();

        // 获得这个方法声明的泛型参数类型。 如果这个方法没有参数，则返回长度为 0 的数组。
        Type[] genericParameterTypes = method.getGenericParameterTypes();
    }
}
