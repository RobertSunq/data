package book.api;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author: Robert Sun q
 * @date: 2023-03-16 18:18
 * @since: JDK-
 */
public class HashSetApi {
    public static void main(String[] args) {
        System.out.println("HashSet API");
    }

    private <E> void api(HashSet<E> hashSet, E e) {

        // 构造一个空散列值
        HashSet<Character> characters = new HashSet<>();

        // 构造一个散列值，并将集合中的所有元素添加到这个散列集中
        HashSet<String> strings = new HashSet<>(Arrays.asList("d", "da"));
        // HashSet(Collection<? extends E> elements);

        // 构造一个空的具有指定容量（桶数）的散列集
        HashSet<Object> objects = new HashSet<>(16);

        // 构造一个有指定容量=32 和装填因子=0.9f （0.0 —— 1.0 之间的一个数，确定散列集填充的百分比， 当大于这个百分比时，散列表进行再散列）的空散列集
        HashSet<Float> floats = new HashSet<>(32, 0.9F);

    }
}
