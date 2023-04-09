package book.api;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author: Robert Sun q
 * @date: 2023-03-16 21:28
 * @since: JDK-
 */
public class MapApi {
    public static void main(String[] args) {
        System.out.println("Map API");
    }

    private <K, V> void api(Map<K, V> map, K k, V v) {

        // 获取与键关联的值；返回与键关联的对象，或者如果映射中没有这个对象，则返回null，实现类可以禁止键为 null
        V v1 = map.get(k);

        // 获得与键关联的值；返回与键关联的对象，或者如果未在映射中找到这个键，则返回 defaultValue = v
        V orDefault = map.getOrDefault(k, v);

        // 将关联的一堆键和值放到映射中。如果这个键已经存在，新的对象将取代与这个键关联的旧对象。这个方法将返回键关联的旧值。
        // 如果之前没有这个键，则返回 null。实现类可以禁止键或值为 null
        V put = map.put(k, v);

        // 键给定映射中的所有映射条目添加到这个映射中
        map.putAll(new HashMap<>());
        // void putAll(Map<? extends K, ? extends V> entries);

        // 如果在映射中已经有这个键，返回 true
        boolean b = map.containsKey(k);

        // 如果在映射中已经有这个值，返回 true
        boolean b1 = map.containsValue(v);

        // 对这个映射中的所有 键/值 对引用这个动作
        map.forEach((k1, v2) -> System.out.println("K = " + k1 + ", V = " + v2));
        // default void forEach(BiConsumer<? super K, ? super V> action)

        // 如果 key 与一个非 null 值 v 关联，将函数应用到 v 和 value，将 key 与结果关联，或者
        // 如果结果为 null，则删除这个键。否则， 将 key 与 value 关联，返回 get(key)
        // default V merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction);

        // 将函数应用到 key 和 get(key)。将 key 与结果关联，或者如果结果为 null，则删除这个键，返回 get(key)
        // default V compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction);

        // 如果 key 与一个非 null 值 V 关联，将函数应用到 key 和 v，将 key 与结果关联，或者如果结果为null，则删除这个键。返回 get(key)
        // default V computeIfPresent(K key, BiFunction<? super K, ? super V, ？ extends V> remappingFunction);

        // 将这个函数应用到 key，除非 key 与一个非null值关联。将 key 与结果关联，或者如果结果为null，则删除这个键。返回 get(key)
        // default V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction);

        // 再所有映射条目上应用这个函数。将键与非 null 结果关联， 对于 null 结果，贼将相应的键删除
        // default void replaceAll(BiFunction<? super K, ? super V, ? extends V> function)

        // 如果 key 不存在或者与 null 关联，则将它与 value 关联，并返回 null。否则返回关联的值。
        // default V putIfAbsent(K key, V value);

        // 返回 Map.Entry 对象（映射中的键/值对）的一个集视图。可以从这个集中删除元素，他们将从映射中删除，但是不能添加任何元素。
        Set<Map.Entry<K, V>> entries = map.entrySet();

        // 返回映射中所有键的一个集视图。可以从这个集中删除元素，键和相关联的值将从映射中删除，但是不能添加任何元素
        Set<K> ks = map.keySet();

        // 返回映射中所有值的一个集合视图。可以从这个集合中删除元素，所删除的值及相应的键将从映射中删除，不过不能添加任何元素
        Collection<V> values = map.values();
    }

    private <K, V> void api(Map.Entry<K, V> entry, K k, V v) {

        // 返回这个映射条目的键
        K key = entry.getKey();

        // 返回这个映射条目的值
        V value = entry.getValue();

        // 将相关映射中的值改为新值，并返回原来的值
        V v1 = entry.setValue(v);

    }
}
