class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] status = new int[26];
        for (char c : tasks) {
            status[c - 'A']++;
        }
        int max = 0;
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, status[i]);
        }

        int tt = 0;

        for (int i = 0; i < 26; i++) {
            tt += (status[i] == max) ? 1 : 0;
        }
        return Math.max(tasks.length, (max - 1) * (n + 1) + tt);
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了100.00% 的Java用户
 * 内存消耗:42.4 MB,击败了55.21% 的Java用户
 */