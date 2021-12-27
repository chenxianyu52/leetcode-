class Solution {
    public int thirdMax(int[] nums) {
        long a = Long.MIN_VALUE, b = Long.MIN_VALUE, c = Long.MIN_VALUE;
        for (int num : nums) {
            if (num > a) {
                c = b;
                b = a;
                a = num;
            } else if (num > b && num < a) {
                c = b;
                b = num;
            } else if (num > c && num < b) {
                c = num;
            }
        }
        return (int)(c == Long.MIN_VALUE ? a : c);
    }
}
/**
 * 解答成功:
 * 				执行耗时:0 ms,击败了100.00% 的Java用户
 * 				内存消耗:38.2 MB,击败了72.28% 的Java用户
 */