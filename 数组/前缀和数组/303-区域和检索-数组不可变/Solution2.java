class NumArray {

    private int[] resultSum = null;

    public NumArray(int[] nums) {
        int len = nums.length;
        resultSum = new int[len + 1]; // resultSum[i] 0...nums[i - 1] 的和
        resultSum[0] = 0;
        for (int i = 1; i < len + 1; i++) {
            resultSum[i] = resultSum[i - 1] + nums[i - 1];
        }
    }

    public int sumRange(int left, int right) {
        return resultSum[right + 1] - resultSum[left];
    }
}
/**
 * 解答成功:
 * 执行耗时:7 ms,击败了100.00% 的Java用户
 * 内存消耗:44.1 MB,击败了44.10% 的Java用户
 */