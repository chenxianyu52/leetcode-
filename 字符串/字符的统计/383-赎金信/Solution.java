class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] magazineChars = magazine.toCharArray();
        int[] status = new int[26];
        for (char c : magazineChars) {
            status[c - 'a']++;
        }
        char[] ransomNoteChars = ransomNote.toCharArray();
        for (char c : ransomNoteChars) {
            status[c - 'a']--;
            if (status[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了99.95% 的Java用户
 * 内存消耗:41.5 MB,击败了48.47% 的Java用户
 */