package book.api;

import java.util.Objects;
import java.util.function.Supplier;

/**
 * @author: Robert Sunq
 * @date: 2022-08-06 23:28
 * @since: JDK-
 */
public class ObjectsApi {

    public static void main(String[] args) {
        System.out.println(" API");
    }

    private void api(Objects objects) {

        // static 如果 objects 为null， 以下三个方法会抛出一个NullPointerException异常而没有消息或者给定的消息
        Objects.requireNonNull(objects);

        Objects.requireNonNull(objects,"objects is not null");

        Objects.requireNonNull(objects, new Supplier<String>() {
            @Override
            public String get() {
                return "objects is not null";
            }
        });

        // static 如果带校验对象为null， 则返回一个设定的默认值
        ObjectsApi objectsApi = Objects.requireNonNullElse(new ObjectsApi(), new ObjectsApi());

        ObjectsApi objectsApi1 = Objects.requireNonNullElseGet(new ObjectsApi(), new Supplier<ObjectsApi>() {
            @Override
            public ObjectsApi get() {
                return new ObjectsApi();
            }
        });
    }
}
