class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int min = nums.length;
        int max = -1;
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i];
//            System.out.println("temp: " + temp);
            int j = i - 1;
//            System.out.println("nums[j]" + nums[j]);
            for (; j >= 0 && temp < nums[j]; j--) {
                nums[j + 1] = nums[j];
                min = Math.min(min, j);
//                System.out.println("min: " + min);
            }
            if (nums[j + 1] != temp) {
                nums[j + 1] = temp;
                max = Math.max(max, i);
//                System.out.println("max: " + max);
            }
        }
        if (min == nums.length || max == -1) {
            return 0;
        }
        return max - min + 1;
    }
}
/**
 * 解答成功:
 * 执行耗时:173 ms,击败了5.02% 的Java用户
 * 内存消耗:41.8 MB,击败了77.42% 的Java用户
 */