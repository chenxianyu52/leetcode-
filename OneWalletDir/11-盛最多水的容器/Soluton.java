class Solution {
    public int maxArea(int[] height) {
        int len = height.length;
        int left = 0;
        int right = len - 1;
        int max = 0;
        while (left < right) {
            int cheng = (right - left) * Math.min(height[left], height[right]);
            max = Math.max(max, cheng);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
/**
 * 解答成功:
 * 执行耗时:4 ms,击败了67.10% 的Java用户
 * 内存消耗:51.9 MB,击败了5.06% 的Java用户
 */