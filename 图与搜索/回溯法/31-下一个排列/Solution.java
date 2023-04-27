class Solution {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return;
        }
//        if(len == 2){
//            reverse(nums);
//            return;
//        }

        int currentIndex = -1;
        int currentNum = nums[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            if (nums[i] >= currentNum) {
                currentNum = nums[i];
            } else {
                currentIndex = i;
                break;
            }
        }
//        System.out.println("currentIndex : " + currentIndex);
        if (currentIndex == -1) {
            reverse(nums);
            return;
        }

        currentNum = nums[currentIndex];
        for (int i = len - 1; i > currentIndex; i--) {
            if (nums[i] > currentNum) {
                int temp = nums[currentIndex];
                nums[currentIndex] = nums[i];
                nums[i] = temp;
                Arrays.sort(nums, currentIndex + 1, len);
                break;
            }
        }
    }

    private void reverse(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了37.39% 的Java用户
 * 内存消耗:41.6 MB,击败了70.92% 的Java用户
 */