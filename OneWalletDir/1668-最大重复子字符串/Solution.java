class Solution {
    public int maxRepeating(String sequence, String word) {
        int i = 1;
        String s = word;
        while (true) {
            if (!sequence.contains(s)) {
                break;
            } else {
                s = s + word;
                i++;
            }
        }
        return i - 1;
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了56.60% 的Java用户
 * 内存消耗:39.5 MB,击败了63.20% 的Java用户
 */