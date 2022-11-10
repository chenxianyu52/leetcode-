class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int right = pairs[0][1];
        int result = 1;
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > right) {
                result++;
                right = pairs[i][1];
            }
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:7 ms,击败了99.04% 的Java用户
 * 内存消耗:41.3 MB,击败了88.65% 的Java用户
 */