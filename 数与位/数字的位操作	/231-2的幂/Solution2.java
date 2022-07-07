class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
//        System.out.println("yihuo: " + (n ^ 0));
        if ((n & (n - 1)) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:38.5 MB,击败了69.12% 的Java用户
 */