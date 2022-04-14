class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // 输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
        //输出: [["bat"],["nat","tan"],["ate","eat","tea"]]

        List<List<String>> result = new ArrayList<>();

        for (String string : strs) {
            boolean isInsert = false;
            int len = result.size();
            for (int i = 0; i < len; i++) {
                if (isMatch(result.get(i).get(0).toCharArray(), string.toCharArray())) {
                    result.get(i).add(string);
                    isInsert = true;
                    break;
                }
            }
            if (!isInsert) {
                ArrayList<String> list = new ArrayList<>();
                list.add(string);
                result.add(list);
            }
        }
        return result;

    }

    private boolean isMatch(char[] sourceChars, char[] targetChars) {
        if (sourceChars.length != targetChars.length) {
            return false;
        }
        int[] status = new int[26];
        for (char c : sourceChars) {
            status[c - 'a']++;
        }
        for (char c : targetChars) {
            if (status[c - 'a'] == 0) {
                return false;
            }
            status[c - 'a']--;
        }
        return true;
    }
}
/**
 * 解答成功:
 * 执行耗时:2650 ms,击败了5.00% 的Java用户
 * 内存消耗:43.9 MB,击败了78.24% 的Java用户
 */