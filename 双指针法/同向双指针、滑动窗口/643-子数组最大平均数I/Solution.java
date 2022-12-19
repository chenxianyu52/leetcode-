class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int len = nums.length;
        if (len == 1) {
            return (double) nums[0] / k;
        }
        int left = 0;
        int right = -1;
        double maxSum = -Double.MAX_VALUE;
        double tempSum = 0;
        while (right < len) {
            if (right - left != k - 1) {
                right++;
                if (right < len) {
                    tempSum += nums[right];
                }
//                System.out.println("right: " + right + " , tempSum: " + tempSum);
            } else {
//                System.out.println("right: " + right + " , left: " + left);
//                if(right - left == k){
                maxSum = Math.max(tempSum, maxSum);
//                    System.out.println("ttt: " + maxSum);
//                }
                tempSum -= nums[left];
                left++;
            }
        }
//        System.out.println("maxSum : " + maxSum);
        return maxSum / k;
    }
}
/**
 * 解答成功:
 * 执行耗时:5 ms,击败了39.18% 的Java用户
 * 内存消耗:48.9 MB,击败了83.61% 的Java用户
 */