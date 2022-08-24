package vip.hyzt.questions;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <h2>146. LRU 缓存</h2>
 * <p>请你设计并实现一个满足 <a href="https://baike.baidu.com/item/LRU">LRU (最近最少使用)</a> 缓存 约束的数据结构。实现 LRUCache 类：</p>
 * <ul>
 *     <li>LRUCache(int capacity) 以 <strong>正整数</strong> 作为容量 capacity 初始化 LRU 缓存</li>
 *     <li>int get(int key) 如果关键字 key 存在于缓存中，则返回关键字的值，否则返回 -1 。</li>
 *     <li>void put(int key, int value) 如果关键字 key 已经存在，则变更其数据值 value ；如果不存在，则向缓存中插入该组 key-value 。如果插入操作导致关键字数量超过 capacity ，则应该 <strong>逐出</strong> 最久未使用的关键字</li>
 * </ul>
 * <p>函数 get 和 put 必须以 O(1) 的平均时间复杂度运行。</p>
 * <h3>示例：</h3>
 * <pre>
 *     输入
 *     ["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"]
 *     [[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]
 *     输出
 *     [null, null, null, 1, null, -1, null, -1, 3, 4]
 *
 *     解释
 *     LRUCache lRUCache = new LRUCache(2);
 *     lRUCache.put(1, 1); // 缓存是 {1=1}
 *     lRUCache.put(2, 2); // 缓存是 {1=1, 2=2}
 *     lRUCache.get(1);    // 返回 1
 *     lRUCache.put(3, 3); // 该操作会使得关键字 2 作废，缓存是 {1=1, 3=3}
 *     lRUCache.get(2);    // 返回 -1 (未找到)
 *     lRUCache.put(4, 4); // 该操作会使得关键字 1 作废，缓存是 {4=4, 3=3}
 *     lRUCache.get(1);    // 返回 -1 (未找到)
 *     lRUCache.get(3);    // 返回 3
 *     lRUCache.get(4);    // 返回 4
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>1 <= capacity <= 3000</li>
 *     <li>0 <= key <= 10000</li>
 *     <li>0 <= value <= 10<sup>5</sup></li>
 *     <li>最多调用 2 * 10<sup>5</sup> 次 get 和 put</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/lru-cache">https://leetcode.cn/problems/lru-cache</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic146LRUCache extends LinkedHashMap<Integer, Integer> {

    private final int capacity;

    public Topic146LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    public int get(int key) {
        return super.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        super.put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
