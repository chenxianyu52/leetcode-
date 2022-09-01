class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        for (int i = 0; i < charS.length; i++) {
            char key = charS[i];
            char value = charT[i];
            if (map.containsKey(key)) {
                char vv = map.get(key);
                if (vv != value) {
                    return false;
                }
            } else {
                if (map.containsValue(value)) {
                    return false;
                }
                map.put(key, value);
            }
        }
        return true;
    }
}
/**
 * 解答成功:
 * 执行耗时:8 ms,击败了86.26% 的Java用户
 * 内存消耗:41.5 MB,击败了31.79% 的Java用户
 */