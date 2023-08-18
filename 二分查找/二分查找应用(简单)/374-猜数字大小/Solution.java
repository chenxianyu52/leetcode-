public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        int middle = left + (right - left) / 2;
        while (guess(middle) != 0) {
            if (guess(middle) == 1) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
            middle = left + (right - left) / 2;
        }
        return middle;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:38.4 MB,击败了5.09% 的Java用户
 */