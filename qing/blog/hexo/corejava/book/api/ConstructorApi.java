package book.api;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;

/**
 * @author: Robert Sun q
 * @date: 2023-02-02 23:44
 * @since: JDK-
 */
public class ConstructorApi {

    public static void main(String[] args) {
        System.out.println("Constructor API");
    }

    private <T> void api(Constructor<T> constructorParam) throws IllegalAccessException, InvocationTargetException, InstantiationException {

        // 将 params 传递到构造器，来构造这个构造器声明类的一个新实例， throws IllegalAccessException, InvocationTargetException, InstantiationException
        T t = constructorParam.newInstance(1, 3);
    }
}
