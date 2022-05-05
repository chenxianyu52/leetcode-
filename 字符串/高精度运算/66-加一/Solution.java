class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        digits[len - 1]++;
        if (digits[len - 1] < 10) {
            return digits;
        }
        boolean isJin = true;
        digits[len - 1] = 0;

        int i = len - 2;

        while (i >= 0 && isJin) {
            digits[i]++;
            if (digits[i] == 10) {
                digits[i] = 0;
                isJin = true;
            } else {
                isJin = false;
            }
            i--;
        }
        if (isJin) {
            int[] result = new int[len + 1];
            result[0] = 1;
            for (int j = 1; j < len + 1; j++) {
                result[j] = digits[j - 1];
            }
            return result;
        } else {
            return digits;
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:39.6 MB,击败了86.52% 的Java用户
 */