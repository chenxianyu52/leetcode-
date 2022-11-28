class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0;
        int min = 0;
        int minIndex = 0;
        for (int i = 0; i < gas.length; i++) {
            sum = gas[i] - cost[i] + sum;
            if (sum < min) {
                min = sum;
                minIndex = i + 1;
            }
        }
        if (sum >= 0) {
            return minIndex;
        } else {
            return -1;
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了100.00% 的Java用户
 * 内存消耗:60.8 MB,击败了76.75% 的Java用户
 */