class Solution {
    // 一次循环替换
    public void moveZeroes(int[] nums) {
        int k = 0 ;
        for(int i = 0 ;i<nums.length ;i++){
            if(nums[i] != 0){
                int a = nums[i];
                nums[i] = nums[k];
                nums[k] = a;
                k++;
            }
        }
    }
}
/**
 * 解答成功:
 * 				执行耗时:2 ms,击败了60.25% 的Java用户
 * 				内存消耗:39.2 MB,击败了97.07% 的Java用户
 */