class Solution {
    public int arrayNesting(int[] nums) {
        int result = 0;
        Set<Integer> setAll = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (setAll.contains(nums[i])) {
                continue;
            }
            Set<Integer> tempSet = new HashSet<>();
            int current = nums[i];
            while (!tempSet.contains(nums[current])) {
                current = nums[current];
                tempSet.add(current);
                setAll.add(current);
            }
            result = Math.max(result, tempSet.size());
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:90 ms,击败了5.18% 的Java用户
 * 内存消耗:56.1 MB,击败了49.22% 的Java用户
 */