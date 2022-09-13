class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int len = nums.length;
        if (len < 4) {
            return result;
        }
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int start = j + 1;
                int end = nums.length - 1;
                int t = target - nums[i] - nums[j];
                if (t > nums[end] * 2) {
                    continue;
                }
                if (t < nums[start] * 2) {
                    break;
                }
                while (start < end) {
                    if (end < len - 1 && nums[end] == nums[end + 1]) {
                        end--;
                        continue;
                    }
//                    System.out.println("i: " + i + " , j:" + j + ",start: " + start + ", end: " + end);
//                    System.out.println("nums[i]: " + nums[i] + " , nums[j]:" + nums[j] + ",nums[start]: " + nums[start] + ", nums[end]: " + nums[end]);
                    long sum = (long) nums[i] + (long) nums[j] + (long) nums[start] + (long) nums[end];
                    if (sum == (long) target) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[start]);
                        list.add(nums[end]);
                        result.add(list);
                        start++;
                        end--;
                    } else if (sum > (long) target) {
                        end--;
                    } else {
                        start++;
                    }
                }
            }
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:3 ms,击败了83.99% 的Java用户
 * 内存消耗:42.2 MB,击败了14.99% 的Java用户
 */