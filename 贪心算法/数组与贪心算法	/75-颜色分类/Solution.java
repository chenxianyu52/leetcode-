class Solution {
    public void sortColors(int[] nums) {
        int zeroIndex = -1; // [0..zerIndex] 为0 （zerIndex..i] 1
        int twoIndex = nums.length; // [twoIndex,len -1 ] 为2
        int i = 0;
        while (i < twoIndex) {
            if (nums[i] == 0) {
                if (i - 1 == zeroIndex) {
                    zeroIndex++;
                    i++;
                } else {
                    swap(nums, zeroIndex + 1, i);
                    zeroIndex++;
                    i++;
                }
            } else if (nums[i] == 2) {
                swap(nums, twoIndex - 1, i);
                twoIndex--;
            } else {
                i++;
            }
        }
    }

    private void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:40.3 MB,击败了7.11% 的Java用户
 */