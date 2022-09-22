class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int result = 0;
        for (int i = 0; i < len; i++) {
            if (flowerbed[i] == 1) {
                continue;
            }
            if (i - 1 >= 0 && i + 1 <= len - 1) {
                if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                    result++;
                    flowerbed[i] = 1;
                    continue;
                }
            }
            if (i == 0) {
                if (i + 1 <= len - 1 && flowerbed[i + 1] == 0) {
                    result++;
                    flowerbed[i] = 1;
                    continue;
                }
                if (i + 1 >= len) {
                    result++;
                    flowerbed[i] = 1;
                    continue;
                }
            }
            if (i == len - 1) {
                if (i - 1 >= 0 && flowerbed[i - 1] == 0) {
                    result++;
                    flowerbed[i] = 1;
                    continue;
                }
            }
        }
        return result >= n;

    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了84.72% 的Java用户
 * 内存消耗:42 MB,击败了29.44% 的Java用户
 */