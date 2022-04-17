class Solution {
    public boolean judgeCircle(String moves) {
        int leftStatus = 0;
        int upStatus = 0;
        char[] chars = moves.toCharArray();
        for (char c : chars) {
            if (c == 'U') {
                upStatus++;
            }
            if (c == 'D') {
                upStatus--;
            }
            if (c == 'L') {
                leftStatus++;
            }
            if (c == 'R') {
                leftStatus--;
            }
        }
        return leftStatus == 0 && upStatus == 0;
    }
}
/**
 * 解答成功:
 * 执行耗时:5 ms,击败了70.93% 的Java用户
 * 内存消耗:40.8 MB,击败了82.22% 的Java用户
 */