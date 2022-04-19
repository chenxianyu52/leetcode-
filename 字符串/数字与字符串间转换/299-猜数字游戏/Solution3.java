class Solution {
    public String getHint(String secret, String guess) {
        int aSum = 0;
        int bSum = 0;
        int sLen = secret.length();
        int[] status = new int[10];
        for (int i = 0; i < sLen; i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                aSum++;
            }
            status[secret.charAt(i) - '0']++;
        }
        for (int i = 0; i < sLen; i++) {
            char c = guess.charAt(i);
            if (status[c - '0'] > 0) {
                bSum++;
                status[c - '0']--;
            }
        }
        return aSum + "A" + (bSum - aSum) + "B";
    }
}
/**
 * 解答成功:
 * 执行耗时:5 ms,击败了70.83% 的Java用户
 * 内存消耗:41.1 MB,击败了66.82% 的Java用户
 */