package nogamincho.interview.w_146;

import java.util.*;

class LRUCache {

    final int capacity;
    final List<Integer> list;
    final Map<Integer, Integer> map;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.list = new ArrayList<>();
        this.map = new HashMap<>();
    }

    public int get(int key) {
        if (list.contains(key)) {
            list.add(list.remove(list.lastIndexOf(key)));
            return map.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
        if (list.contains(key)) {
            list.remove(list.remove(list.lastIndexOf(key)));
            map.remove(key);
        }
        if (list.size() == capacity) {
            list.remove(0);
        }
        list.add(key);
        map.put(key, value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */

/*
LRUCache cache = new LRUCache( 2 )
    cache.put(1, 1);
    cache.put(2, 2);
    cache.get(1);       // returns 1
    cache.put(3, 3);    // evicts key 2
    cache.get(2);       // returns -1 (not found)
    cache.put(4, 4);    // evicts key 1
    cache.get(1);       // returns -1 (not found)
    cache.get(3);       // returns 3
    cache.get(4);       // returns 4
 */