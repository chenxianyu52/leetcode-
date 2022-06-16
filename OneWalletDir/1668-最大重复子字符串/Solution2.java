class Solution {
    public int maxRepeating(String sequence, String word) {
        int i = 1;
        StringBuilder s = new StringBuilder(word);
        while (true) {
            if (!sequence.contains(s)) {
                break;
            } else {
                s.append(word);
                i++;
            }
        }
        return i - 1;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:39.5 MB,击败了64.21% 的Java用户
 */