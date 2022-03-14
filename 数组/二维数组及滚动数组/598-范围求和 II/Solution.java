class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        if (ops.length == 0) {
            return m * n;
        }
        int mLength = ops.length;
        int minA = Integer.MAX_VALUE;
        int minB = Integer.MAX_VALUE;
        for (int i = 0; i < mLength; i++) {
            minA = Math.min(minA, ops[i][0]);
            minB = Math.min(minB, ops[i][1]);
        }
        return minA * minB;
    }
}

/**
 *
 * 执行用时: 0 ms
 * 内存消耗: 41 MB
 */