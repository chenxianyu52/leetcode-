class Solution {
    public int captureForts(int[] forts) {
        int len = forts.length;
        int noBaoFlag = -1;
        int youBaoFlag = -1;
        int result = 0;
        for (int i = 0; i < len - 1; i++) {
            if (forts[i] == -1) {
                for (int j = i + 1; j < len; j++) {
                    if (forts[j] == 1) {
                        result = Math.max(result, j - i - 1);
                        break;
                    } else if (forts[j] == -1) {
                        break;
                    }
                }
            }
            if (forts[i] == 1) {
                for (int j = i + 1; j < len; j++) {
                    if (forts[j] == -1) {
                        result = Math.max(result, j - i - 1);
                        break;
                    } else if (forts[j] == 1) {
                        break;
                    }
                }
            }
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:39 MB,击败了92.04% 的Java用户
 */