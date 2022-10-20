package vip.hyzt.datastructures.cache.lru;

import java.util.HashMap;
import java.util.Map;

/**
 * <h2>哈希表 + 双向链表</h2>
 *
 * @author 力扣（LeetCode）
 * @see <a href="https://leetcode.cn/problems/lru-cache/solutions/259678/lruhuan-cun-ji-zhi-by-leetcode-solution/">https://leetcode.cn/problems/lru-cache/solutions/259678/lruhuan-cun-ji-zhi-by-leetcode-solution/</a>
 */
public class LRUCache<K, V> {


    static class LinkedNode<K, V> {
        K key;
        V value;
        LinkedNode<K, V> prev;
        LinkedNode<K, V> next;

        public LinkedNode() {
        }

        public LinkedNode(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private final Map<K, LinkedNode<K, V>> cache = new HashMap<>();

    private int size;

    private final int capacity;

    private final LinkedNode<K, V> head;
    private final LinkedNode<K, V> tail;

    public LRUCache(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.head = new LinkedNode<>();
        this.tail = new LinkedNode<>();
        head.next = tail;
        tail.prev = head;
    }

    public V get(K key) {
        LinkedNode<K, V> node = cache.get(key);
        if (node == null) {
            return null;
        }
        moveToHead(node);
        return node.value;
    }

    public void put(K key, V value) {
        LinkedNode<K, V> node = cache.get(key);
        if (node == null) {
            LinkedNode<K, V> newNode = new LinkedNode<>(key, value);
            cache.put(key, newNode);
            addToHead(newNode);
            ++size;
            if (size > capacity) {
                LinkedNode<K, V> tail = removeTail();
                cache.remove(tail.key);
                --size;
            }
        }
        else {
            node.value = value;
            moveToHead(node);
        }
    }

    private void addToHead(LinkedNode<K, V> node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    private void removeNode(LinkedNode<K, V> node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void moveToHead(LinkedNode<K, V> node) {
        removeNode(node);
        addToHead(node);
    }

    private LinkedNode<K, V> removeTail() {
        LinkedNode<K, V> res = tail.prev;
        removeNode(res);
        return res;
    }

}
