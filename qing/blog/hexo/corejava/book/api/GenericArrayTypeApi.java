package book.api;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/**
 * @author: Robert Sun q
 * @date: 2023-03-13 0:06
 * @since: JDK-
 */
public class GenericArrayTypeApi {
    public static void main(String[] args) {
        System.out.println("GenericArrayType API");
    }

    private void api(GenericArrayType genericArrayType) {

        // 获得这个数组类型声明的泛型元素类型。
        Type genericComponentType = genericArrayType.getGenericComponentType();
    }
}
