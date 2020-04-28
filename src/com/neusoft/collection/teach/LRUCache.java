package com.neusoft.collection.teach;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author: wwb
 * @Date: 2020/4/28 09:11
 */
public class LRUCache<K,V> extends LinkedHashMap<K,V> {

    private final int CACHE_SIZE;
    /**
     * 传递进来最多能缓存多少数据 *
     * @param cacheSize 缓存大小 */
    public LRUCache(int cacheSize) {
        // false按照插入顺序进行排序，true按照访问顺序，把访问的元素插入到链表后
        super((int) Math.ceil(cacheSize / 0.75) + 1, 0.75f, true);
        CACHE_SIZE = cacheSize;
    }
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        // 当 map 中的数据量大于指定的缓存个数的时候，就自动删除最老的数据。
        return this.size() > CACHE_SIZE;
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put("1", "a");
        lruCache.put("2", "b");
        lruCache.put("3", "c");
        lruCache.put("4", "c");
        lruCache.get("3");
        System.out.println(lruCache);
    }
}
