class Solution {
    public int countNicePairs(int[] nums) {
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        long result = 0;
        int mod = 1000000007;
        for (int i = 0; i < len; i++) {
            int cha = nums[i] - rev(nums[i]);
            int preSum = map.getOrDefault(cha, 0);
            result += preSum;
            map.put(cha, preSum + 1);
        }
//        for(int i = 0;i< len - 1;i++){
//            for(int j = i + 1;j<len;j++){
//                if((nums[i] - nums[j]) == (status[i] - status[j])){
//                    result ++;
//                }
//            }
//        }
        return (int) (result % mod);


    }

    private int rev(int num) {
        long result = 0;
        while (num > 0) {
            result = result * 10 + num % 10;
            num /= 10;
        }
        return (int) result;
    }
}
/**
 * 解答成功:
 * 执行耗时:32 ms,击败了88.29% 的Java用户
 * 内存消耗:57.9 MB,击败了17.12% 的Java用户
 */