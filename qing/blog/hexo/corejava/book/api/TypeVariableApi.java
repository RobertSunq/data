package book.api;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/**
 * @author: Robert Sun q
 * @date: 2023-03-12 23:24
 * @since: JDK-
 */
public class TypeVariableApi {
    public static void main(String[] args) {
        System.out.println("TypeVariable API");
    }

    private void api(TypeVariable typeVariable) {

        // 获得这个类型变量的名字
        String name = typeVariable.getName();

        // 获得这个类型变量的子类限定，否则，如果该变量无限定，则返回长度为0的数组
        Type[] bounds = typeVariable.getBounds();
    }
}
