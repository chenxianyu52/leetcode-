class Solution {
    public int maxArea(int[] height) {
        int len = height.length;
        int left = 0;
        int right = len - 1;
        int result = 0;
        while (left < right) {
//            System.out.println("left: " + left + " , right: " + right);
            int heightLeft = height[left];
            int heightRight = height[right];
            if (heightLeft <= heightRight) {
                int current = heightLeft * (right - left);
                result = Math.max(result, current);
                left++;
            } else {
                int current = heightRight * (right - left);
                result = Math.max(result, current);
                right--;
            }
        }
        return result;

    }
}
/**
 * 解答成功:
 * 执行耗时:3 ms,击败了91.04% 的Java用户
 * 内存消耗:51.3 MB,击败了71.75% 的Java用户
 */