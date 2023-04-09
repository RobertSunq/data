package book.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: Robert Sunq
 * @date: 2022-07-19 0:56
 * @since: JDK-
 */
public class ArraysApi {

    public static void main(String[] args) {
        System.out.println("ArraysApi API");
    }

    private void api(Arrays arrays) {

        // static 将数组传为字符串，使用 ','分割
        String s = Arrays.toString(new Object[]{10, 12L, "aaa"});

        // static 拷贝数组，newLength = 5， 为新数组的长度；不足原数组时截取前半部分， 多余时，后面填充默认值
        Object[] objects = Arrays.copyOf(new Object[]{10, 12L, "aaa"}, 5);

        // static 按照指定下标范围拷贝数组
        Object[] objects1 = Arrays.copyOfRange(new Object[]{10, 12L, "aa"}, 1, 3);

        // static 使用快速排序对数组进行排序
        Arrays.sort(new Object[]{10, 12L, "aa"});

        // static 使用二分查找算法在有序数组中查找值 key = 10
        // 如果找到了 key，则返回相应的下标；否则，返回一个负数值 i。 (-i) - 1 是 v 应插入的位置（为了保持数组的有序）
        int i = Arrays.binarySearch(new Object[]{10, 12, 14, 10}, 10);

        // static 按照指定下标范围，使用二分查找算法在有序数组中查找值 key = 10
        // 如果找到了 key，则返回相应的下标；否则，返回一个负数值 i。 (-i) - 1 是 v 应插入的位置（为了保持数组的有序）
        int i1 = Arrays.binarySearch(new Object[]{10, 12, 14, 10}, 1, 3, 10);

        // static 将数组的所有数据元素设置为 val = 8
        Arrays.fill(new int[4], 8);

        // static 如果两个数组大小相同，并且下标相同的元素都对应相等，返回 true
        boolean equals = Arrays.equals(new int[]{1, 2, 3}, new int[]{1, 2, 3});

        // 计算数组的散列值。
        int i2 = Arrays.hashCode(new int[]{1, 2, 3});

        // 对数组 Object[] 中的元素进行排序。要求数组中的元素必须属于实现了 Comparable 接口的类，并且元素之间必须是可比较的。
        Arrays.sort(new Object[] {1, 10L});

        // 返回一个数组中元素的列表视图。这个数组是可修改的，但其大小不可变
        List<Integer> integers = Arrays.asList(1, 3, 4);
        // static <E> List<E> asList(E... array)
    }
}
