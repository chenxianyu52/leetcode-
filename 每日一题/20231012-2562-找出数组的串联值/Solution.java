class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        long result = 0L;
        while (left <= right) {
            if (left == right) {
                result += nums[left];
            } else {
                result += process(nums[left], nums[right]);
//                System.out.println(result);
            }
            left++;
            right--;
        }
        return result;
    }

    private long process(int left, int right) {
        int temp = right;
        while (right > 0) {
            left = left * 10;
            right = right / 10;
        }
        return left + temp;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:40.7 MB,击败了82.50% 的Java用户
 */