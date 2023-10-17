class Solution {
    public int sumOfMultiples(int n) {
        int[] tt = new int[]{3, 5, 7};
        int result = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            int j = 1;
            while (tt[i] * j <= n) {
                int t = tt[i] * j;
                if (!set.contains(t)) {
                    set.add(t);
                    result += t;
                }
                j++;
            }
        }
        return result;

    }
}
/**
 * 解答成功:
 * 执行耗时:9 ms,击败了5.12% 的Java用户
 * 内存消耗:42 MB,击败了5.12% 的Java用户
 */