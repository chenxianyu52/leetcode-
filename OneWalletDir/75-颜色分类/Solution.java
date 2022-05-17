class Solution {
    public void sortColors(int[] nums) {
        int i = -1;
        int j = nums.length;// [0..i] 为0；（i..j）为1; [j..len-1] 为2；

        for (int k = 0; k < j; ) {
//            System.out.println("k: " + k + " , i : " + i + ",j: " + j + ",nums[k]:" + nums[k]) ;
//            for(int t = 0;t<nums.length;t++){
//                System.out.println("nums[" + t + "]:" + nums[t]);
//            }
            if (nums[k] == 0) {
                if (i + 1 != k) {
                    swap(k, i + 1, nums);
                }
                i++;
                k++;
                continue;
            }
            if (nums[k] == 1) {
                k++;
                continue;
            }

            if (nums[k] == 2) {
                if (j - 1 != k) {
                    swap(k, j - 1, nums);
                }
                j--;
                continue;
            }
        }

    }

    private void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:39.6 MB,击败了89.52% 的Java用户
 */