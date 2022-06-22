class Solution {
    public long smallestNumber(long num) {
        int flag = num < 0 ? -1 : 1;
        String numString = String.valueOf(num * flag);
        char[] chars = numString.toCharArray();
        Arrays.sort(chars);
        StringBuilder result = new StringBuilder();
        int len = chars.length;
        if (flag > 0) {
            boolean hasInsertFirst = false;
            for (int i = 0; i < len; i++) {
                if (!hasInsertFirst && chars[i] > '0') {
                    result.insert(0, chars[i]);
                    hasInsertFirst = true;
                } else {
                    result.append(chars[i]);
                }
            }
        } else {
            result.append('-');
            for (int i = len - 1; i >= 0; i--) {
                result.append(chars[i]);
            }
        }
        return Long.parseLong(result.toString());
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了82.76% 的Java用户
 * 内存消耗:38.6 MB,击败了60.63% 的Java用户
 */