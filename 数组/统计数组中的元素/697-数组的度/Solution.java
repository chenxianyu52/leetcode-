class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Point> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null) {
                map.put(nums[i], new Point(i, i));
            } else {
                map.get(nums[i]).right = i;
                map.get(nums[i]).sum++;
            }
        }
        int maxSum = 1;
        int minLen = 1;
        for (Map.Entry entry : map.entrySet()) {
            Point point = (Point) entry.getValue();
            if (point.sum > maxSum) {
                maxSum = point.sum;
                minLen = point.right - point.left + 1;
            } else if (point.sum == maxSum && (point.right - point.left + 1) < minLen) {
                minLen = point.right - point.left + 1;
            }
        }
        return minLen;
    }

    static class Point {
        int left;
        int right;
        int sum = 0;

        Point(int left, int right) {
            sum++;
            this.left = left;
            this.right = right;
        }
    }
}
/**
 * 解答成功:
 * 				执行耗时:12 ms,击败了88.95% 的Java用户
 * 				内存消耗:43 MB,击败了30.82% 的Java用户
 */