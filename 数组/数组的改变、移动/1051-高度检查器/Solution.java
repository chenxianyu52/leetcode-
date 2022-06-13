class Solution {
    public int heightChecker(int[] heights) {
        int[] souceHeight = Arrays.copyOf(heights, heights.length);
        Arrays.sort(heights);
        int result = 0;
        for (int i = 0; i < souceHeight.length; i++) {
            if (souceHeight[i] != heights[i]) {
                result++;
            }
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了68.84% 的Java用户
 * 内存消耗:39.5 MB,击败了11.05% 的Java用户
 */