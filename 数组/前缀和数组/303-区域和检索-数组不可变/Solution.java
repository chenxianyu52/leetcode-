class NumArray {

    private int[] result = null;

    public NumArray(int[] nums) {
        result = nums;
    }

    public int sumRange(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum += result[i];
        }
        return sum;
    }
}
/**
 * 解答成功:
 * 执行耗时:49 ms,击败了21.50% 的Java用户
 * 内存消耗:44.3 MB,击败了20.15% 的Java用户
 */