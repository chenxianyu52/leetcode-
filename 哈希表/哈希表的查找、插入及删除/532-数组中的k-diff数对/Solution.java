class Solution {
    public int findPairs(int[] nums, int k) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int a = Math.min(nums[i], nums[j]);
                int b = Math.max(nums[i], nums[j]);
                if (map.containsKey(a)) {
                    continue;
                }
                if (b - a == k) {
//                    System.out.println("b: " + b + " , a : " + a);
                    map.put(a, b);
                    result++;
                }
            }
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:1858 ms,击败了5.00% 的Java用户
 * 内存消耗:43.4 MB,击败了5.03% 的Java用户
 */