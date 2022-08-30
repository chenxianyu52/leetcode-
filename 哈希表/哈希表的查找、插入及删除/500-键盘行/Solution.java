class Solution {
    public String[] findWords(String[] words) {
        String[] keys = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        int[] status = new int[26];
        for (int i = 0; i < keys.length; i++) {
            for (int j = 0; j < keys[i].length(); j++) {
                status[keys[i].charAt(j) - 'a'] = i;
            }
        }
        List<String> result = new ArrayList<>();
        for (String s : words) {
            char[] chars = s.toCharArray();
            int lineNumer = -1;
            boolean isMatchAll = false;
            for (char c : chars) {
                if (lineNumer == -1) {
                    lineNumer = status[Character.toLowerCase(c) - 'a'];
                    isMatchAll = true;
                } else if (lineNumer != status[Character.toLowerCase(c) - 'a']) {
                    isMatchAll = false;
                    break;
                }
            }
            if (isMatchAll) {
                result.add(s);
            }
        }
        return result.toArray(new String[0]);
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:39 MB,击败了97.71% 的Java用户
 */