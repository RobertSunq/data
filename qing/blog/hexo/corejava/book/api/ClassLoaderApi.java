package book.api;

/**
 * @author: Robert Sun q
 * @date: 2023-03-12 22:55
 * @since: JDK-
 */
public class ClassLoaderApi {
    public static void main(String[] args) {
        System.out.println("ClassLoader API");
    }

    private void api(ClassLoader classLoader) {

        // 为通过类加载器加载的类（没有显式的类或包断言状态）启用或禁用断言
        classLoader.setDefaultAssertionStatus(true);

        // 为给定的类和它的内部类启用或禁用断言
        classLoader.setClassAssertionStatus("className", true);

        // 为给定及其子包中的所有类启用或禁用断言
        classLoader.setPackageAssertionStatus("book.api", true);

        // 删除所有显示的类和包断言状态设置，并禁用通过这个类加载器加载的所有类的断言
        classLoader.clearAssertionStatus();
    }
}
