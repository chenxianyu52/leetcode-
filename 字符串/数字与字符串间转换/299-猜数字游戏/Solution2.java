class Solution {
    public String getHint(String secret, String guess) {
        int aSum = 0;
        int bSum = 0;
        int sLen = secret.length();
        int[] sStatus = new int[10];
        int[] gStatus = new int[10];
        for (int i = 0; i < sLen; i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                aSum++;
            } else {
                sStatus[secret.charAt(i) - '0']++;
                gStatus[guess.charAt(i) - '0']++;
            }
        }
        for (int i = 0; i < 10; i++) {
            bSum += Math.min(sStatus[i], gStatus[i]);
        }
        return aSum + "A" + bSum + "B";
    }
}
/**
 * 解答成功:
 * 执行耗时:4 ms,击败了87.41% 的Java用户
 * 内存消耗:41.6 MB,击败了15.60% 的Java用户
 */