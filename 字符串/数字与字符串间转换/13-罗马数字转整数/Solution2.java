class Solution {
    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int result = 0;
        int cacheNum = 0;
        int len = chars.length;
        for (int i = len - 1; i >= 0; i--) {
            int num = 0;
            switch (chars[i]) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
                default:
                    break;
            }
            if (num >= cacheNum) {
                result += num;
            } else {
                result -= num;
            }
            cacheNum = num;
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:2 ms,击败了100.00% 的Java用户
 * 内存消耗:41.5 MB,击败了65.66% 的Java用户
 */