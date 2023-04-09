package book.api;

import java.util.HashMap;

/**
 * @author: Robert Sun q
 * @date: 2023-03-16 21:40
 * @since: JDK-
 */
public class HashMapApi {
    public static void main(String[] args) {
        System.out.println("HashMap API");
    }

    private <K,V>void api(HashMap<K,V> hashMap, K k, V v) {

        // 用给定的容量和装填因子构造一个空散列映射（装填因子是一个 0.0 —— 1.0之间的数。这个数决定散列表填充的百分比。一旦到了这个比例，就要将其散列到更大的散列表中）。默认的装填因子是 0.75
        HashMap<Long, String> longStringHashMap = new HashMap<>();
        HashMap<Long, String> longStringHashMap1 = new HashMap<>(32);
        HashMap<Long, String> longStringHashMap2 = new HashMap<>(32, 0.9F);
    }
}
