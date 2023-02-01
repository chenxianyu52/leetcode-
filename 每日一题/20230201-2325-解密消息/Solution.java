class Solution {
    public String decodeMessage(String key, String message) {
        int[] status = new int[26];
        int index = 1;
        char[] chars = key.toCharArray();
        for (char c : chars) {
            if (c == ' ') {
                continue;
            }
            if (status[c - 'a'] == 0) {
                status[c - 'a'] = index;
                index++;
            }
            if (index > 26) {
                break;
            }
        }
        char[] mesChars = message.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : mesChars) {
            if (c == ' ') {
                sb.append(' ');
            } else {
                char changeChar = (char) ('a' + status[c - 'a'] - 1);
                sb.append(changeChar);
            }
        }
        return sb.toString();
    }
}
/**
 * 解答成功:
 * 执行耗时:2 ms,击败了91.61% 的Java用户
 * 内存消耗:41.1 MB,击败了82.85% 的Java用户
 */