class Solution {
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 7; i >= 0; i--) {
            int val = (num >> (4 * i)) & 0xf;
            if (val > 0 || sb.length() > 0) {
                char c = val < 10 ? (char) (val + '0') : (char) (val + 'a' - 10);
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:38.6 MB,击败了80.82% 的Java用户
 */