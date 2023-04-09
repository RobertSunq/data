package book.api;

import java.util.ArrayList;

/**
 * @author: Robert Sun q
 * @date: 2022-12-05 1:17
 * @since: JDK-
 */
public class ArrayListApi {

    public static void main(String[] args) {
        System.out.println("ArrayListApi API");
    }

    private <T> void api(ArrayList<T> arrayList) {

        ArrayList<Integer> integers = new ArrayList<>();


        // 将值 11 放置到数组列表的指定索引位置，返回之前的内容。
        Integer set = integers.set(1, 11);

        // 得到指定索引位置存储的值。
        T t = arrayList.get(1);

        // 后移元素从而将插入到指定索引位置
        integers.add(2, 22);

        // 删除指定索引位置的元素，并将后面的所有元素迁移。返回所删除的元素。
        T remove = arrayList.remove(1);
    }
}
