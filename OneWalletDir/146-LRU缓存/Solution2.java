class LRUCache {
    private LRUMap<Integer, Integer> map;

    public LRUCache(int capacity) {
        map = new LRUMap<>(capacity);
    }

    public int get(int key) {
        return map.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        map.put(key, value);
    }

    private static class LRUMap<K, V> extends LinkedHashMap<K, V> {
        private int capacity;

        public LRUMap(int capacity) {
            super(capacity, 0.75F, true);
            this.capacity = capacity;
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
            return size() > capacity;
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:40 ms,击败了96.61% 的Java用户
 * 内存消耗:108.2 MB,击败了79.07% 的Java用户
 */