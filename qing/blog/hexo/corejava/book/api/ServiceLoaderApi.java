package book.api;

import java.util.Iterator;
import java.util.Optional;
import java.util.ServiceLoader;
import java.util.stream.Stream;

/**
 * @author: Robert Sun q
 * @date: 2023-03-12 20:58
 * @since: JDK-
 */
public class ServiceLoaderApi {
    public static void main(String[] args) {
        System.out.println("ServiceLoader API");
    }

    private void api(ServiceLoader<Object> serviceLoader) {

        // 创建一个服务加载器来加载实现给定服务接口的类
        // static <S> ServiceLoader<S> load(Class<S> service)

        // 生成一个以 “懒” 方式加载服务类的迭代器。也就是说，迭代器推进时才会加载类
        Iterator<Object> iterator = serviceLoader.iterator();

        // 返回提供者描述的一个流，从而可以采用懒加载方式加载所有的类的提供者
        Stream<ServiceLoader.Provider<Object>> stream = serviceLoader.stream();

        // 查找第一个可用的服务提供者（如果有）
        Optional<Object> first = serviceLoader.findFirst();
    }

    private void apiInternalClass(ServiceLoader.Provider<Object> provider) {

        // 获得这个提供者的类型
        // Class<? extends S> type();
        Class<?> type = provider.type();

        // S get(); 获得这个提供者的实例
        Object o = provider.get();
    }
}
