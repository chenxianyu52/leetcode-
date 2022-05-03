class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String result = "";
        for (String dicString : dictionary) {
            if (result.length() > dicString.length()) {
                continue;
            } else if (result.length() == dicString.length()) {
                if (!isOneSmallestTwo(result, dicString)) {
                    if (isMatch(s, dicString)) {
                        result = dicString;
                    }
                }
            } else {
                if (isMatch(s, dicString)) {
                    result = dicString;
                }
            }
        }
        return result;
    }

    private boolean isMatch(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        int sLen = sChars.length;
        int tLen = tChars.length;
        int tIndex = -1;
        int sIndex = 0;
        while (sIndex < sLen) {
            if (tIndex + 1 < tLen && sChars[sIndex] == tChars[tIndex + 1]) {
                tIndex++;
            }
            sIndex++;
        }
        if (tIndex == tLen - 1) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isOneSmallestTwo(String one, String two) {
        int len = one.length();
        for (int i = 0; i < len; i++) {
            if (one.charAt(i) == two.charAt(i)) {
                continue;
            } else {
                return one.charAt(i) < two.charAt(i);
            }
        }
        return true;
    }
}
/**
 * 解答成功:
 * 执行耗时:15 ms,击败了87.13% 的Java用户
 * 内存消耗:43.2 MB,击败了5.03% 的Java用户
 */