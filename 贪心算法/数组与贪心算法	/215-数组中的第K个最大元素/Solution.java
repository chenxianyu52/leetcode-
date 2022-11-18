class Solution {
    public int findKthLargest(int[] nums, int k) {
        List<Integer> status = new ArrayList();
        for (int i = 0; i < k; i++) {
            status.add(nums[i]);
        }
        Collections.sort(status);
        for (int i = k; i < nums.length; i++) {
            if (nums[i] > status.get(0)) {
                status.set(0, nums[i]);
                Collections.sort(status);
            }
        }
        return status.get(0);
    }
}
/**
 * Time Limit Exceeded
 */