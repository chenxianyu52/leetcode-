class Solution {
    public String countAndSay(int n) {
        String preString = "1";
        for (int i = 1; i < n; i++) {
            char[] tempChars = preString.toCharArray();
            StringBuilder sb = new StringBuilder();
            char tempChar = tempChars[0];
            int sum = 1;
            for (int j = 1; j < tempChars.length; j++) {
                if (tempChars[j] == tempChar) {
                    sum++;
                } else {
                    sb.append(sum).append(tempChar);
                    sum = 1;
                    tempChar = tempChars[j];
                }
            }
            preString = sb.append(sum).append(tempChar).toString();
        }
        return preString;
    }
}
/**
 * 解答成功:
 * 执行耗时:3 ms,击败了66.54% 的Java用户
 * 内存消耗:38.8 MB,击败了84.83% 的Java用户
 */