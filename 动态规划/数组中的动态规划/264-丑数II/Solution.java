class Solution {
    public int nthUglyNumber(int n) {
        PriorityQueue<Long> queue = new PriorityQueue<>();
        HashSet<Long> set = new HashSet<>();
        int[] q = {2, 3, 5};
        queue.add(1L);
        set.add(1L);
        int ugly = 0;
        for (int i = 0; i < n; i++) {
            long current = queue.poll();
            ugly = (int) current;
            for (int j = 0; j < 3; j++) {
                long next = current * q[j];
                if (set.add(next)) {
                    queue.offer(next);
                }
            }
        }
        return ugly;
    }
}
/**
 * 解答成功:
 * 执行耗时:48 ms,击败了35.62% 的Java用户
 * 内存消耗:42.2 MB,击败了25.65% 的Java用户
 */