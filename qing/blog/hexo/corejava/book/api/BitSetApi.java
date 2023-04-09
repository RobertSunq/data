package book.api;

import java.util.BitSet;

/**
 * @author: Robert Sun q
 * @date: 2023-03-19 23:11
 * @since: JDK-
 */
public class BitSetApi {
    public static void main(String[] args) {
        System.out.println("BitSet API");
    }

    private void api(BitSet bitSet) {

        // 创建一个位集
        BitSet bitSet1 = new BitSet(32);

        // 返回位集的 逻辑长度 即 1 加上位集的最高位的索引
        int size = bitSet.size();

        // 获得一个位
        boolean b = bitSet.get(10);

        // 设置一个位
        bitSet.set(10);

        // 清除一个位
        bitSet.clear();

        // 这个位集与另一个位集进行逻辑 与
        bitSet.and(new BitSet());

        // 这个位集与另一个位集进行逻辑 或
        bitSet.or(new BitSet());

        // 这个位集与另一个位集进行逻辑 异或
        bitSet.xor(new BitSet());

        // 对应另一个位集中设置为 1 的所有位，将这个位集中相应的位清除为 0
        bitSet.andNot(new BitSet());
    }
}
