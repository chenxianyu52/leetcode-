class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < len - 2; i++) {
            int numsI = nums[i];
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = len - 1;
            while (left < right) {
                if (left > i + 1 && nums[left] == nums[left - 1]) {
                    left++;
                    continue;
                }
                if (right < len - 1 && nums[right] == nums[right + 1]) {
                    right--;
                    continue;
                }
                int numsJ = nums[left];
                int numsK = nums[right];
                if (numsI + numsJ + numsK == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(-numsJ - numsK);
                    list.add(numsJ);
                    list.add(numsK);
                    result.add(list);
                    left++;
                    right--;
                } else if (numsJ + numsK > -numsI) {
                    right--;
                } else {
                    left++;
                }
                if(numsJ == numsK){
                    break;
                }
            }
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:37 ms,击败了13.21% 的Java用户
 * 内存消耗:45.8 MB,击败了32.00% 的Java用户
 */