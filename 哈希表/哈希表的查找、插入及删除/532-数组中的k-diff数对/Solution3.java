class Solution {
    public int findPairs(int[] nums, int k) {
        Set<Integer> visited = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for (int num : nums) {
            if (visited.contains(num + k)) {
                result.add(num);
            }
            if (visited.contains(num - k)) {
                result.add(num - k);
            }
            visited.add(num);
        }
        return result.size();
    }
}
/**
 * 解答成功:
 * 执行耗时:11 ms,击败了33.63% 的Java用户
 * 内存消耗:42 MB,击败了36.30% 的Java用户
 */