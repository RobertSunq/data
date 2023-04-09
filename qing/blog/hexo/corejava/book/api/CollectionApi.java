package book.api;

import java.util.*;
import java.util.function.Predicate;

/**
 * @author: Robert Sun q
 * @date: 2023-03-13 22:59
 * @since: JDK-
 */
public class CollectionApi {
    public static void main(String[] args) {
        System.out.println("Collection API");
    }

    private void api(Collection<Long> collection) {

        // 返回一个用于访问集合中各个元素的迭代器
        Iterator<Long> iterator = collection.iterator();

        // 返回当前存储在集合中的元素个数
        int size = collection.size();

        // 如果集合中没有元素，返回true
        boolean empty = collection.isEmpty();

        // 如果集合中包含了一个与obj = 1L 相等的对象，返回true
        boolean contas = collection.contains(1L);

        // 如果这个集合包含 other = new ArrayList<>() 集合中的所有元素，返回 true
        boolean b = collection.containsAll(new ArrayList<>());

        // 将一个元素添加到集合中，如果由于这个调用改变了集合，返回 true
        boolean add = collection.add(3L);

        // 将 other = new HashSet<>() 集合中的所有元素添加到这个集合。如果由于这个调用改变了集合，返回 true
        boolean b1 = collection.addAll(new HashSet<>());

        // 从这个集合中和删除等于 obj = 10L 的对象。如果有匹配的对象被删除，返回 true
        boolean remove = collection.remove(10L);

        // 从这个集合中删除 other = new LinkedList<>() 集合中存在的所有元素。如果由于这个调用改变了集合，返回 true
        boolean b2 = collection.removeAll(new LinkedList<>());

        // 从这个集合删除 filter 返回 true 的所有元素， 如果由于这个调用改变了集合，则返回 true
        boolean b3 = collection.removeIf(new Predicate<Long>() {
            @Override
            public boolean test(Long aLong) {
                return aLong < 10;
            }
        });
        boolean b4 = collection.removeIf(a -> a < 10);

        // 从这个集合中删除所有的元素
        collection.clear();

        // 从这个集合中删除所有与 other = new ArrayList<>() 集合中元素不同的元素。如果由于这个调用改变了集合，返回 true
        boolean b5 = collection.retainAll(new ArrayList<>());

        // 返回这个集合中的对象的数组
        Object[] objects = collection.toArray();

        // 返回这个集合中的对象的数组。如果 arrayToFill 足够大，就将集合中的元素填入这个数组中。剩余空间填补 null；
        // 否则，分配一个新数组，其成员类型与 arrayToFill 的成员类型相同，其长度等于集合的大小，并填充集合元素。
        Long[] longs = collection.toArray(new Long[]{});
        // <T> T[] toArray(T[] arrayToFill)

        // 删除所有匹配的元素
        // default boolean removeIf(Predicate<? super E> filter)
    }
}
