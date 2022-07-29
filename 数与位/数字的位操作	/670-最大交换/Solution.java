class Solution {
    public int maximumSwap(int num) {
        String numString = String.valueOf(num);
        char[] chars = numString.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            int maxIndex = i + 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[maxIndex] < chars[j] || (chars[maxIndex] == chars[j] && j > maxIndex)) {
                    maxIndex = j;
                }
            }
            if (chars[i] < chars[maxIndex]) {
                char temp = chars[i];
                chars[i] = chars[maxIndex];
                chars[maxIndex] = temp;
                String result = new String(chars);
                return Integer.parseInt(result);
            }
        }
        return num;

    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:38.5 MB,击败了28.39% 的Java用户
 */