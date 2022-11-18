class Solution {
    public int findKthLargest(int[] nums, int k) {
        int[] status = new int[k];
        for (int i = 0; i < k; i++) {
            status[i] = nums[i];
        }
        Arrays.sort(status);
        for (int i = k; i < nums.length; i++) {
            if (nums[i] > status[0]) {
//                status.set(0,nums[i]);
                int index = 0;
                int num = nums[i];

                for (int j = 1; j < k; j++) {
                    if (status[j] < num) {
                        status[index] = status[j];
                        index++;
                    } else {
                        break;
                    }
                }
                status[index] = num;
            }
        }
        return status[0];
    }
}
/**
 * 解答成功:
 * 执行耗时:1434 ms,击败了5.33% 的Java用户
 * 内存消耗:51.9 MB,击败了5.01% 的Java用户
 */