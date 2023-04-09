package book.api;

import java.lang.reflect.Modifier;

/**
 * @author: Robert Sun q
 * @date: 2023-02-04 22:58
 * @since: JDK-
 */
public class ModifierApi {
    public static void main(String[] args) {
        System.out.println("Modifier API");
    }

    private void api(Modifier modifier) {

        // 返回一个字符串，包含对应modifiers中位设置的修饰符
        String s = Modifier.toString(2);

        // 这些方法将检测modifiers值中与方法名中修饰符对应的二进制位
        boolean anAbstract = Modifier.isAbstract(1);
        boolean aFinal = Modifier.isFinal(3);
        boolean anInterface = Modifier.isInterface(3);
        boolean aNative = Modifier.isNative(1);
        boolean aPrivate = Modifier.isPrivate(2);
        boolean aProtected = Modifier.isProtected(3);
        boolean aPublic = Modifier.isPublic(1);
        boolean aStatic = Modifier.isStatic(5);
        boolean strict = Modifier.isStrict(2);
        boolean aSynchronized = Modifier.isSynchronized(4);
        boolean aVolatile = Modifier.isVolatile(6);
    }

}
