class Solution {
    public boolean validUtf8(int[] data) {
        int len = data.length;
        for (int i = 0; i < len; ) {
            int temp = data[i];
            int j = 7;
            while (j >= 0 && ((temp >> j) & 1) == 1) {
                j--;
            }
            int wei = 7 - j;
            if (wei == 1 || wei > 4) {
                return false;
            }

            if (i + wei - 1 > len) {
                return false;
            }

            for (int k = i + 1; k < i + wei; k++) {
                if ((((data[k] >> 7) & 1) == 1) && (((data[k] >> 6) & 1) == 0)) continue;
                return false;
            }
            if (wei == 0) {
                i++;
            } else {
                i += wei;
            }
        }
        return true;

    }
}
/**
 * 解答成功:
 * 执行耗时:2 ms,击败了61.07% 的Java用户
 * 内存消耗:41.8 MB,击败了65.65% 的Java用户
 */