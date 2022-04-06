class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if (len == 0) {
            return "";
        }
        if (len == 1) {
            return strs[0];
        }
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < len; j++) {
                if (i > strs[j].length() - 1) {
                    return sb.toString();
                }
                if (c != strs[j].charAt(i)) {
                    return sb.toString();
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了68.69% 的Java用户
 * 内存消耗:39.4 MB,击败了29.63% 的Java用户
 */