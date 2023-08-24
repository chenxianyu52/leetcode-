class Solution {
    public int[] countBits(int n) {
        int[] status = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            String s = Integer.toBinaryString(i);
            char[] chars = s.toCharArray();
            int left = 0;
            int right = chars.length - 1;
            int sum = 0;
            while (left <= right) {
                if (left == right) {
                    if (chars[left] == '1') {
                        sum++;
                    }
                    left++;
                    right--;
                } else {
                    if (chars[left] == '1') {
                        sum++;
                    }
                    if (chars[right] == '1') {
                        sum++;
                    }
                    left++;
                    right--;
                }
            }
            status[i] = sum;
        }
        return status;
    }
}
/**
 * 解答成功:
 * 执行耗时:12 ms,击败了6.77% 的Java用户
 * 内存消耗:44 MB,击败了99.80% 的Java用户
 */