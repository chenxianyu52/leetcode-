class Solution {
    public int reverse(int x) {
        if (x < 10 && x > -10) {
            return x;
        }
        int result = 0;
        while (x != 0) {
            int temp = result * 10 + x % 10;
            x /= 10;
            if (temp / 10 != result) {
                return 0;
            }
            result = temp;
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了41.58% 的Java用户
 * 内存消耗:39.1 MB,击败了11.85% 的Java用户
 */