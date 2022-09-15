class Solution {
    public int subarraySum(int[] nums, int k) {
        int len = nums.length;
        int[] status = new int[len];
        int result = 0;
        for (int i = 0; i < len; i++) {
            status[i] = nums[i];
            if (status[i] == k) {
                result++;
            }
        }
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
//                System.out.println("i: " + i + ",j: " + j);
//                System.out.println("status[j]: " + status[j] + " , status[j - 1]: " + status[j - 1] + " , status[i] : " + status[i]);
                if (j == i + 1) {
                    status[j] = nums[j] + nums[i];
                } else {
                    status[j] = nums[j] + status[j - 1];
                }
//                System.out.println("status[j] result : " + status[j]);
                if (status[j] == k) {
                    result++;
                }
            }
        }
        return result;
    }
}
/**
 * Time Limit Exceeded
 */