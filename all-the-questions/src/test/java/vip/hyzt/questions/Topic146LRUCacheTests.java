package vip.hyzt.questions;

import org.junit.Test;

public class Topic146LRUCacheTests {

    @Test
    public void LRUCache() {
        Topic146LRUCache lruCache = new Topic146LRUCache (2);
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        System.out.println(lruCache.get(1));
        lruCache.put(3, 3);
        System.out.println(lruCache);
        System.out.println(lruCache.get(2));
    }

}
