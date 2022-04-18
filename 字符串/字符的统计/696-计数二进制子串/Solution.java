class Solution {
    public int countBinarySubstrings(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        int result = 0;
        if (len <= 1) {
            return result;
        }
        for (int i = 0; i < len - 1; i++) {
            char firstChar = chars[i];
            int firstSum = 1;
            int lastSum = 0;
            for (int j = i + 1; j < len; j++) {
                if (chars[j] == chars[j - 1]) {
                    if (chars[j] == firstChar) {
                        firstSum++;
                    } else {
                        lastSum++;
                        if (lastSum == firstSum) {
                            result++;
                        } else if (lastSum > firstSum) {
                            break;
                        }
                    }
                } else {
                    if (chars[j] == firstChar) {
                        break;
                    } else {
                        lastSum++;
                        if (lastSum == firstSum) {
                            result++;
                        } else if (lastSum > firstSum) {
                            break;
                        }
                    }
                }
            }
        }
        return result;

    }
}
/**
 * 运行失败:
 * Time Limit Exceeded
 */