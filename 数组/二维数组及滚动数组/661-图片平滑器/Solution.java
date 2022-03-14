class Solution {
    public int[][] imageSmoother(int[][] img) {
        int mLength = img.length;
        int nLength = img[0].length;
        int[][] result = new int[mLength][nLength];
        for (int i = 0; i < mLength; i++) {
            for (int j = 0; j < nLength; j++) {
                int sumLength = 0;
                int sum = 0;
                for (int k = 0; k < 3; k++) {
                    for (int q = 0; q < 3; q++) {
                        if ((i - 1 + k) < mLength && (i - 1 + k) >= 0 && (j - 1 + q) < nLength && (j - 1 + q) >= 0) {
                            sum += img[i - 1 + k][j - 1 + q];
                            sumLength++;
                        }
                    }
                }
                result[i][j] = sum / sumLength;
            }
        }
        return result;
    }
}

/**
 * 执行用时: 6 ms
 * 内存消耗: 41.8 MB
 */