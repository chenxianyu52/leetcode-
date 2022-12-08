class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int len = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int a = 0; a < len - 3; a++) {
            int numsA = nums[a];
            if (a > 0 && nums[a] == nums[a - 1]) {
                continue;
            }
            for (int d = len - 1; d > a + 2; d--) {
                int numsD = nums[d];
                if (d < len - 1 && nums[d] == nums[d + 1]) {
                    continue;
                }
                int b = a + 1;
                int c = d - 1;
                while (b < c) {
                    if (b > a + 1 && nums[b] == nums[b - 1]) {
                        b++;
                        continue;
                    }
                    if (c < d - 1 && nums[c] == nums[c + 1]) {
                        c--;
                        continue;
                    }
                    int numsB = nums[b];
                    int numsC = nums[c];
                    if ((long) numsB + numsC + numsA + numsD == target) {
//                        System.out.println("a: " + a + " , b: " + b + ", c : " + c + " ,d: " + d);
                        List<Integer> list = new ArrayList<>();
                        list.add(numsA);
                        list.add(numsB);
                        list.add(numsC);
                        list.add(numsD);
                        result.add(list);
                        b++;
                        c--;
                    } else if ((long) numsB + numsC + numsA + numsD > target) {
                        c--;
                    } else {
                        b++;
                    }
                }
            }
        }
        return result;

    }
}
/**
 * 解答成功:
 * 执行耗时:22 ms,击败了20.52% 的Java用户
 * 内存消耗:41.6 MB,击败了81.93% 的Java用户
 */