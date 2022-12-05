class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] result = new int[nums.length];
        Deque<Integer> queue = new ArrayDeque<>();
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i <= (len - 1) * 2; i++) {
            int x = nums[i % len];
            while (!queue.isEmpty() && nums[queue.peekLast() % len] < x) {
                map.put(queue.pollLast() % len, x);
            }
            queue.offer(i % len);
        }
//        while (!queue.isEmpty()) {
//            int last = queue.pollLast();
//            Integer first = queue.peekFirst();
//            if (first != null && nums[last] < nums[first]) {
//                map.put(last, nums[first]);
//            }
//        }
        for (int i = 0; i < len; i++) {
            result[i] = map.getOrDefault(i, -1);
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:12 ms,击败了54.05% 的Java用户
 * 内存消耗:45.6 MB,击败了5.01% 的Java用户
 */