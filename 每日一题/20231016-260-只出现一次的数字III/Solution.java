class Solution {
    public int[] singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        int[] result = new int[2];
        int index = 0;
        for (Integer i : set) {
            result[index++] = i.intValue();
        }
        return result;

    }
}
/**
 * 解答成功:
 * 执行耗时:3 ms,击败了32.15% 的Java用户
 * 内存消耗:43.5 MB,击败了9.99% 的Java用户
 */