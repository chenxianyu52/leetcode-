class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] ss = s.split(" ");
        if (ss.length != pattern.length()) {
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char key = pattern.charAt(i);
            String value = ss[i];
            if (!map.containsKey(key)) {
                if (map.containsValue(value)) {
                    return false;
                }
                map.put(key, value);
            } else {
                String valueFromMap = map.get(key);
                if (!valueFromMap.equals(value)) {
                    return false;
                }
            }
        }
        return true;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:39.1 MB,击败了83.79% 的Java用户
 */