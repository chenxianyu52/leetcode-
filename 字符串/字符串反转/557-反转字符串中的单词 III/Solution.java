class Solution {
    public String reverseWords(String s) {
        String[] ss = s.split(" ");
        int len = ss.length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append(revese(ss[i].toCharArray(), 0, ss[i].length() - 1));
            if (i != len - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    private String revese(char[] sChar, int start, int end) {
        while (start < end) {
            char temp = sChar[start];
            sChar[start] = sChar[end];
            sChar[end] = temp;
            start++;
            end--;
        }
        return new String(sChar);
    }
}
/**
 * 解答成功:
 * 执行耗时:4 ms,击败了80.47% 的Java用户
 * 内存消耗:41.8 MB,击败了35.56% 的Java用户
 */