class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if (nums[i] != i + 1) {
                int tmp = nums[i];//[4,3,2,7,8,2,3,1]
                while (tmp != nums[tmp - 1]) {
                    int temp = nums[tmp - 1];
                    nums[tmp - 1] = tmp;
                    tmp = temp;
                }
            }
        }
        for (int i = 0; i < len; i++) {
            if (nums[i] != i + 1) {
                list.add(i + 1);
            }
        }
        return list;
    }
}
/**
 * 解答成功:
 * 执行耗时:6 ms,击败了41.56% 的Java用户
 * 内存消耗:47.4 MB,击败了37.41% 的Java用户
 */