class LRUCache {
    LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
    LinkedList<Integer> list = new LinkedList<>();
    private int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        int value = map.getOrDefault(key, -1);
//        System.out.println("get key: " + key  + " , value : " + value);
        if (value == -1) {
            return -1;
        } else {
            map.remove(key);
            map.put(key, value);
            list.remove(new Integer(key));
            list.add(key);
//            for(int i = 0;i<list.size();i++){
//                System.out.println("get 22 : " + i + " , value : " + list.get(i) );
//            }
            return value;
        }
    }

    public void put(int key, int value) {
//        System.out.println("put: " + key);
        if (map.containsKey(key)) {
            map.replace(key, value);
            list.remove(new Integer(key));
            list.add(key);
            return;
        }
        if (map.size() == capacity) {
            int removeKey = list.pollFirst();
//            System.out.println("put remove: " + removeKey);
            map.remove(removeKey);
            map.put(key, value);
            list.add(key);
        } else {
            map.put(key, value);
            list.add(key);
        }
//        for(int i = 0;i<list.size();i++){
//            System.out.println("put 22 : " + i + " , value : " + list.get(i) );
//        }

    }
}
/**
 * 解答成功:
 * 执行耗时:1085 ms,击败了5.05% 的Java用户
 * 内存消耗:117.9 MB,击败了8.65% 的Java用户
 */