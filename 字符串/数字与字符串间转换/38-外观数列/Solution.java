class Solution {
    public String countAndSay(int n) {
        String[] strings = new String[n];
        strings[0] = "1";
        for (int i = 1; i < n; i++) {
            char[] tempChars = strings[i - 1].toCharArray();
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
            strings[i] = sb.append(sum).append(tempChar).toString();
        }
        return strings[n - 1];
    }
}
/**
 * 解答成功:
 * 执行耗时:4 ms,击败了62.25% 的Java用户
 * 内存消耗:39.3 MB,击败了49.39% 的Java用户
 */