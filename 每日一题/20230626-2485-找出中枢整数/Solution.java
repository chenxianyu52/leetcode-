class Solution {
    public int pivotInteger(int n) {
        int sum = (1 + n) * n / 2;
        int left = sum;
        int right = n;
        if (left == right) {
            return n;
        }
        int temp = n;
        while (left > right) {
            left -= temp;
            right += (temp - 1);
            temp--;
        }
        if (left < right) {
            return -1;
        }
        return temp;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:38.4 MB,击败了71.56% 的Java用户
 */