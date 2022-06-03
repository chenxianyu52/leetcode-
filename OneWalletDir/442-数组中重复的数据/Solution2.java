class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != nums[nums[i] - 1]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] - 1 != i) {
                list.add(nums[i]);
            }
        }
        return list;

    }
}
/**
 * 解答成功:
 * 执行耗时:5 ms,击败了85.41% 的Java用户
 * 内存消耗:49.6 MB,击败了17.45% 的Java用户
 */