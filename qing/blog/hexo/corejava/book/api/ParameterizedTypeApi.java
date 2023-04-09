package book.api;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author: Robert Sun q
 * @date: 2023-03-13 0:03
 * @since: JDK-
 */
public class ParameterizedTypeApi {
    public static void main(String[] args) {
        System.out.println("ParameterizedType API");
    }

    private void api(ParameterizedType parameterizedType) {

        // 获得这个参数化类型的原始类型
        Type rawType = parameterizedType.getRawType();

        // 获得这个参数化类型生成的类型参数
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();

        // 如果是内部类型，则返回其他外部类类型；如果是一个顶级类型，则返回 null
        Type ownerType = parameterizedType.getOwnerType();
    }
}
