package book.api;

import java.lang.reflect.Array;

/**
 * @author: Robert Sun q
 * @date: 2023-02-04 23:19
 * @since: JDK-
 */
public class ArrayApi {
    public static void main(String[] args) {
        System.out.println("Array API");
    }

    private void api(Array array) {

        // (xxx 是 boolean、byte、char、double、float、int、long、short中的一种基本类型)这些方法将返回存储在给定数组中给定索引位置上的值
        Object o = Array.get(array, 10);
        // Array.getXxx(Object array, int index);

        // (xxx 是 boolean、byte、char、double、float、int、long、short中的一种基本类型)这些方法将一个新值存储到给定数组中的给定位置上
        Array.set(array, 10, 10.0f);
        // Array.setXxx(Object array, int index, xxx newValue);

        // 返回给定数组的长度
        int length = Array.getLength(new int[]{});

        // 返回一个有给定类型、给定大小的新数组
        Object o1 = Array.newInstance(Object.class, 10);
        Object o2 = Array.newInstance(Object.class, 10, 3, 4);
    }

}
