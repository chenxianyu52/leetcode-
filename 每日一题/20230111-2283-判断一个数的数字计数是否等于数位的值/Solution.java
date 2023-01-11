class Solution {
    public boolean digitCount(String num) {
        int[] status = new int[10];
        int[] statusSum = new int[10];
        char[] chars = num.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            status[i] = chars[i] - '0';
            statusSum[chars[i] - '0']++;
        }
        for (int i = 0; i < chars.length; i++) {
            int sum = statusSum[i];
            if (status[i] != statusSum[i]) {
                return false;
            }
        }

        return true;

    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:39.9 MB,击败了51.94% 的Java用户
 */