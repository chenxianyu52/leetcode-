class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        int len = chars.length;
        int temp = k;
        for (int i = len - 1; i >= 0; i--) {
            if (chars[i] == '-') {
                continue;
            } else {
                if (temp == 0) {
                    temp = k;
                    sb.append('-');
                }
                if (chars[i] >= 'a' && chars[i] <= 'z') {
                    sb.append(Character.toUpperCase(chars[i]));
                } else {
                    sb.append(chars[i]);
                }
                temp--;
            }

        }
        sb.reverse();
        return sb.toString();
    }
}
/**
 * 解答成功:
 * 执行耗时:7 ms,击败了96.24% 的Java用户
 * 内存消耗:41.3 MB,击败了71.31% 的Java用户
 */