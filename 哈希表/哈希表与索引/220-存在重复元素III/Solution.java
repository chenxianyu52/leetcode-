class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        int len = nums.length;
        int start = 0;
        int end = -1;
        while (start < len) {
//            System.out.println("start: " + start + " , end: " + end);
            if (end - start < k && end + 1 < len) {
                end++;
//                System.out.println("nums[end] ： " + nums[end] + "，floor: "+set.floor(nums[end]) + ", ceiling: " + set.ceiling(nums[end]));
                if ((set.floor(nums[end]) != null && (long) nums[end] <= t + (long) set.floor(nums[end])) || (set.ceiling(nums[end]) != null && (long) set.ceiling(nums[end]) <= t + (long) nums[end])) {
                    return true;
                }
                set.add(nums[end]);
            } else {
                set.remove(nums[start]);
                start++;
            }
        }
        return false;
    }
}
/**
 * 解答成功:
 * 执行耗时:70 ms,击败了27.05% 的Java用户
 * 内存消耗:43.7 MB,击败了23.47% 的Java用户
 */