class Solution {
    public int findComplement(int num) {
        int res = 0;
        for (int i = 0; num != 0; i++) {
            int n = ((num & 1) ^ 1) << i;
//            System.out.println("n : " + n);
            res |= n;
            num >>>= 1;
        }
        return res;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:38.5 MB,击败了30.50% 的Java用户
 */