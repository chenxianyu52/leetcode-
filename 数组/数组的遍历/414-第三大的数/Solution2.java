class Solution {
    public int thirdMax(int[] nums) {
        int[] maxs = new int[3];
        // 冒泡排序
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        int next = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                maxs[0] = nums[0];
                next++;
            } else if (nums[i] < maxs[next - 1]) {
                maxs[next] = nums[i];
                next++;
            }
            if (next == 3) break;
        }
        if (next == 3) {
            return maxs[2];
        } else {
            return maxs[0];
        }
    }
}
/**
 * 解答成功:
 * 					执行耗时:179 ms,击败了5.09% 的Java用户
 * 					内存消耗:38.3 MB,击败了50.03% 的Java用户
 */