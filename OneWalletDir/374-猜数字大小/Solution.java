public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        while (end > start) {
            int mid = (end - start) / 2 + start;
            if (guess(mid) == 0) {
                return mid;
            } else if (guess(mid) > 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:38.2 MB,击败了46.88% 的Java用户
 */