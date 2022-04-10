class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        int len = s.length();
        int count = len / k;
        reverseStrWithStartEnd(0, Math.min(k - 1, len - 1), sb);
        for (int i = 1; i < count; i++) {
            if (i % 2 == 0) {
                int start = k * i;
                int end = k * (i + 1) - 1;
                reverseStrWithStartEnd(start, end, sb);
            }
        }
        if (count > 0 && count % 2 == 0) {
            int start = count * k;
            int end = len - 1;
            reverseStrWithStartEnd(start, end, sb);
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
 * 内存消耗:41.4 MB,击败了28.34% 的Java用户
 */