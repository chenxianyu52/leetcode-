class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] charsS1 = s1.toCharArray();
        char[] charsS2 = s2.toCharArray();
        int lenS1 = charsS1.length;
        int lenS2 = charsS2.length;
        int[] statusS1 = new int[26];
        int[] statusS2 = new int[26];
        for (char c : charsS1) {
            statusS1[c - 'a']++;
        }
        int left = 0;
        int right = -1;
        while (left < lenS2) {
            if (right + 1 < lenS2 && right - left + 1 < lenS1) {
                right++;
                statusS2[charsS2[right] - 'a']++;
            } else {
                if (right - left + 1 == lenS1 && Arrays.equals(statusS1, statusS2)) {
                    return true;
                }
                statusS2[charsS2[left] - 'a']--;
                left++;
            }
        }
        return false;
    }
}
/**
 * 解答成功:
 * 执行耗时:3 ms,击败了97.19% 的Java用户
 * 内存消耗:41.7 MB,击败了24.06% 的Java用户
 */