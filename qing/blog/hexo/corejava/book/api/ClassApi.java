package book.api;


import java.io.InputStream;
import java.lang.reflect.*;
import java.net.URL;

/**
 * @author: Robert Sun q
 * @date: 2022-12-05 1:14
 * @since: JDK-
 */
public class ClassApi {

    public static void main(String[] args) {
        System.out.println("ClassApi API");
    }

    private <T> void api(Class<T> classParam) throws ClassNotFoundException, NoSuchMethodException, NoSuchFieldException, IllegalAccessException, InstantiationException {

        // 返回这个类的名字
        String name = classParam.getName();

        // 以Class对象的形式返回这个类的超类
        Class<? super T> superclass = classParam.getSuperclass();

        // 返回一个Class对象， 表示名为className的类。 throws ClassNotFoundException
        Class<?> aClass = Class.forName("book.api.ClassApi");

        // 生成一个对象，描述有指定参数类型的构造器。 throws NoSuchMethodException
        Constructor<T> constructor = classParam.getConstructor(ClassApi.class, Class.class);

        // 找到与类位于同一位置的资源，返回一个可以用来加载资源的URL或者输出流，如果没有找到资源，则返回null，而不会抛出I/O错误。
        URL resource = classParam.getResource("aa.jpg");
        InputStream resourceAsStream = classParam.getResourceAsStream("aa.jpg");

        // 得到指定名的公共字段
        Field aaa = classParam.getField("aaa");

        // 返回一个包含Field对象的数组，这些对象对应这个类或者其超类的公共字段
        Field[] fields = classParam.getFields();

        // 得到类中声明的指定名的字段
        Field bbb = classParam.getDeclaredField("bbb");

        // 同样返回包含field对象的数组，这些对象对应这个类的全部字段。 上述两个方法，如果类中没有字段，或者Class对象描述的是基本类型或数组类型，这些方法将返回一个长度为0的数组
        Field[] declaredFields = classParam.getDeclaredFields();

        // 返回包含Method对象的数组：getMethods将返回所有的公共方法，包括从超类继承来的公共方法；
        Method[] methods = classParam.getMethods();
        // 返回这个类或者接口的全部方法，但不包含由超类继承的方法
        Method[] declaredMethods = classParam.getDeclaredMethods();

        // 返回包含Constructor对象的数组，其中包含Class对象所表示的类的所有公共构造器
        Constructor<?>[] constructors = classParam.getConstructors();
        // 返回全部构造器
        Constructor<?>[] declaredConstructors = classParam.getDeclaredConstructors();

        // 得到包含这个类型的包的包名，如果这个类型是一个数组类型，则返回元素类型所属的包；或者如果这个类型是一个基本类型，则返回"java.lang"
        String packageName = classParam.getPackageName();

        // 返回无参数构造器构造的一个新实例
        T t = classParam.newInstance();

        // 如果 obj 为 null 或有可能转换成类型 T ， 则返回 obj；否则抛出一个 BadCastException 异常
        T cast = classParam.cast(new Object());

        // 如果 T 是枚举类型，则返回所有值组成的数组，否则返回 null
        T[] enumConstants = classParam.getEnumConstants();

        // 返回这个类的超类。 如果 T 不是一个类或 Object 类， 则返回 null
        Class<? super T> superclass1 = classParam.getSuperclass();

        // 获得公共构造器，或者有给定参数类型的构造器
        // Constructor<T> classParam.getConstructor(Class... parameterTypes);
        // Constructor<T> classParam.getDeclaredConstructor(Class... parameterTypes

        // 如果这个类型被声明为泛型类型，则获得泛型类型变量，否则获得一个长度为0的数组
        TypeVariable<Class<T>>[] typeParameters = classParam.getTypeParameters();

        // 获得这个类型所声明超类的泛型类型；如果这个类型是 Object 或者不是类类型（ class type）， 则返回 null
        Type genericSuperclass = classParam.getGenericSuperclass();

        // 获得这个类型所声明接口的泛型类型（按照声明的次序），否则，如果这个类型没有实现接口，则返回类型为 0 的数组
        Type[] genericInterfaces = classParam.getGenericInterfaces();
    }
}
