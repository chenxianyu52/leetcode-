class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        int len = s.length();
        for (int i = 0; i < len; i += 2 * k) {
            reverseStrWithStartEnd(i, Math.min(i + k, len) - 1, sb);
        }
        return sb.toString();
    }

    private void reverseStrWithStartEnd(int start, int end, StringBuilder sb) {
        int newStart = start;
        int newEnd = end;
        while (newStart < newEnd) {
            char temp = sb.charAt(newStart);
            sb.setCharAt(newStart, sb.charAt(newEnd));
            sb.setCharAt(newEnd, temp);
            newStart++;
            newEnd--;
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了64.10% 的Java用户
 * 内存消耗:40.8 MB,击败了79.03% 的Java用户
 */