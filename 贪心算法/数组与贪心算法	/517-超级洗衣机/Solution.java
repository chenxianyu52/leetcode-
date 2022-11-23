class Solution {
    public int findMinMoves(int[] machines) {
        int sum = 0;
        int len = machines.length;
        for (int i = 0; i < len; i++) {
            sum += machines[i];
        }
        if (sum % len != 0) {
            return -1;
        }
        int average = sum / len;
        int result = 0;
        int balance = 0;
        for (int i = 0; i < len; i++) {
            balance += (machines[i] - average);
            result = Math.max(result, Math.max(machines[i] - average, Math.abs(balance)));
        }
        return result;

    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:42.4 MB,击败了12.35% 的Java用户
 */