package book.api;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/**
 * @author: Robert Sun q
 * @date: 2023-03-12 23:26
 * @since: JDK-
 */
public class WildcardTypeApi {
    public static void main(String[] args) {
        System.out.println("WildcardType API");
    }

    private void api(WildcardType wildcardType) {

        // 获得这个类型变量的子类（extends）限定，否则，如果没有子类限定，则返长度为0的数组
        Type[] upperBounds = wildcardType.getUpperBounds();

        // 获得这个类型变量的超类（supper）限定，否则，如果没有超类限定，则返回长度为 0 的数组
        Type[] lowerBounds = wildcardType.getLowerBounds();
    }
}
