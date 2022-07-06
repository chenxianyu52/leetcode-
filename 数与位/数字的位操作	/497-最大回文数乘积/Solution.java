class Solution {
    public int largestPalindrome(int n) {
        if (n == 1) {
            return 9;
        }
        int max = (int) (Math.pow(10, n) - 1);

        for (int i = max; i >= 0; i--) {
            long num = i;
            long t = i;
            while (t != 0) {
                num = num * 10 + t % 10;
                t /= 10;
            }
//            System.out.println("num: " + num);
            for (long j = max; j * j >= num; j--) {
                if (num % j == 0) {
                    return (int) (num % 1337);
                }
            }
        }

        return 0;
    }
}
/**
 * 解答成功:
 * 执行耗时:88 ms,击败了83.01% 的Java用户
 * 内存消耗:38.1 MB,击败了67.69% 的Java用户
 */