class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] status = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            status[nums[i]]++;
        }
        for (int i = 0; i < status.length; i++) {
            if (status[i] > 1) {
                list.add(i);
            }
        }
        return list;
    }
}
/**
 * 解答成功:
 * 执行耗时:3 ms,击败了99.90% 的Java用户
 * 内存消耗:49.6 MB,击败了15.96% 的Java用户
 */