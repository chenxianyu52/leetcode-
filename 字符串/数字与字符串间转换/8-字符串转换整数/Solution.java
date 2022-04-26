class Solution {
    public int myAtoi(String s) {
        char[] chars = s.toCharArray();
        long result = 0;
        int flag = 1;
        boolean startNum = false;
        for (char c : chars) {
            if (startNum) {
                if (c <= '9' && c >= '0') {
                    result = result * 10 + (c - '0');
                    if (result * flag > (long) Integer.MAX_VALUE) {
                        return Integer.MAX_VALUE;
                    } else if (result * flag < (long) Integer.MIN_VALUE) {
                        return Integer.MIN_VALUE;
                    } else {
                        continue;
                    }
                } else {
                    break;
                }
            } else {
                if (c <= '9' && c >= '0') {
                    startNum = true;
                    result = result * 10 + (c - '0');
                } else if (c == '+' || c == '-') {
                    if (c == '+') {
                        flag = 1;
                    } else {
                        flag = -1;
                    }
                    startNum = true;
                } else if (c == ' ') {
                    continue;
                } else {
                    break;
                }
            }
        }
        return (int) (flag * result);
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了100.00% 的Java用户
 * 内存消耗:41 MB,击败了81.58% 的Java用户
 */