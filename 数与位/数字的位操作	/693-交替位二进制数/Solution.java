class Solution {
    public boolean hasAlternatingBits(int n) {
        int preFlag = (n & 1);
        n >>>= 1;
        while (n != 0) {
            int x = (n & 1);
            if (x == preFlag) {
                return false;
            } else {
                preFlag = x;
            }
            n >>>= 1;
        }
        return true;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:38.2 MB,击败了65.00% 的Java用户
 */