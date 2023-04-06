class Solution {
    Map<Long, Integer> map = new HashMap<>();

    public int integerReplacement(int n) {
        return dfs(n * 1L);
    }

    private int dfs(long n) {
        if (n == 1) {
            return 0;
        }
        if (map.containsKey(n)) {
            return map.get(n);
        }
        int ans = (n % 2 == 0) ? dfs(n / 2) : Math.min(dfs(n + 1), dfs(n - 1));
        ans++;
        map.put(n, ans);
        return ans;
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了67.90% 的Java用户
 * 内存消耗:38.4 MB,击败了31.12% 的Java用户
 */