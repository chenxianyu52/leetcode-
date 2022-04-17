class Solution {
    public boolean judgeCircle(String moves) {
        int leftStatus = 0;
        int upStatus = 0;
        char[] chars = moves.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            if (chars[left] == 'U') {
                upStatus++;
            }
            if (chars[left] == 'D') {
                upStatus--;
            }
            if (chars[left] == 'L') {
                leftStatus++;
            }
            if (chars[left] == 'R') {
                leftStatus--;
            }
            if (chars[right] == 'U') {
                upStatus++;
            }
            if (chars[right] == 'D') {
                upStatus--;
            }
            if (chars[right] == 'L') {
                leftStatus++;
            }
            if (chars[right] == 'R') {
                leftStatus--;
            }
            left++;
            right--;
        }
        return leftStatus == 0 && upStatus == 0;
    }
}
/**
 * 解答成功:
 * 执行耗时:6 ms,击败了53.60% 的Java用户
 * 内存消耗:41.5 MB,击败了22.40% 的Java用户
 */