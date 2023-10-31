class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        return (int) ((long) getMax(horizontalCuts, h) * getMax(verticalCuts, w) % 1000000007);
    }

    private int getMax(int[] nums, int broad) {
        int start = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i] - start);
            start = nums[i];
        }
        return Math.max(max, broad - start);
    }
}
/**
 * 执行耗时:14 ms,击败了95.00% 的Java用户
 * 内存消耗:52.8 MB,击败了33.49% 的Java用户
 */