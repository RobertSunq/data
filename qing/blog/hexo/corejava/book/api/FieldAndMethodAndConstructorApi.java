package book.api;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author: Robert Sun q
 * @date: 2023-02-04 22:45
 * @since: JDK-
 */
public class FieldAndMethodAndConstructorApi {

    public static void main(String[] args) {
        System.out.println("Field And Method And Constructor API");
    }

    private <T> void api(Field field, Method method, Constructor<T> constructor) throws IllegalAccessException, InvocationTargetException {

        // 返回一个Class对象，表示定义了这个构造器，方法或字段的类
        Class<?> declaringClass = field.getDeclaringClass();
        Class<?> declaringClass1 = method.getDeclaringClass();
        Class<T> declaringClass2 = constructor.getDeclaringClass();

        // 返回一个Class对象数组、其中各个对象表示这个方法所抛出异常的类型
        Class<?>[] exceptionTypes = method.getExceptionTypes();
        Class<?>[] exceptionTypes1 = constructor.getExceptionTypes();

        // 返回一个整数，描述这个构造器、方法或字段的修饰符。使用Modifier类中的方法来分析这个返回值
        int modifiers = field.getModifiers();
        int modifiers1 = method.getModifiers();
        int modifiers2 = constructor.getModifiers();

        // 返回一个表示构造器名、方法名或字段名的字符串
        String name = field.getName();
        String name1 = method.getName();
        String name2 = constructor.getName();

        // 返回一个Class对象数组，其中各个对象表示参数的类型
        Class<?>[] parameterTypes = method.getParameterTypes();
        Class<?>[] parameterTypes1 = constructor.getParameterTypes();

        // 返回一个用于表示返回类型的Class对象
        Class<?> returnType = method.getReturnType();

        // 返回object对象中用这个Field对象描述的字段的值
        Object o = field.get(new Object());

        // 将object对象中这个 field 对象描述的字段设置为一个新值 new value = "aaa"
        field.set(new Object(), "aaa");

        // 调用这个对象描述的方法，传入给定参数，并返回方法的返回值。
        // 对于静态方法，传入null作为隐式参数。
        // 使用包装器传递基本类型值。
        // 基本类型的返回值必须是未包装的
        Object a = method.invoke(new Object(), "a", 3, 10F);

    }
}
