class Solution {
    public int addDigits(int num) {
        while (num >= 10) {
            int res = 0;
            while (num != 0) {
                res += (num % 10);
                num = num / 10;
            }
            num = res;
        }
        return num;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:38.8 MB,击败了43.57% 的Java用户
 */