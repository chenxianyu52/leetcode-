class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // 输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
        //输出: [["bat"],["nat","tan"],["ate","eat","tea"]]

        List<List<String>> result = new ArrayList<>();
        ArrayList<Integer[]> statusList = new ArrayList<>();

        for (String string : strs) {
            boolean isInsert = false;
            int len = statusList.size();
            for (int i = 0; i < len; i++) {
                int[] statusInts = Arrays.stream(statusList.get(i)).mapToInt(Integer::valueOf).toArray();
                if (isMatch(statusInts, result.get(i).get(0).length(), string.toCharArray())) {
                    result.get(i).add(string);
                    isInsert = true;
                }
            }
            if (!isInsert) {
                ArrayList<String> list = new ArrayList<>();
                list.add(string);
                result.add(list);
                char[] chars = string.toCharArray();
                int[] status = new int[26];
                for (char c : chars) {
                    status[c - 'a']++;
                }
                statusList.add(Arrays.stream(status).boxed().toArray(Integer[]::new));
            }
        }
        return result;

    }

    private boolean isMatch(int[] status, int sourceLenth, char[] sChars) {
        if (sourceLenth != sChars.length) {
            return false;
        }
        for (char c : sChars) {
            if (status[c - 'a'] == 0) {
                return false;
            }
            status[c - 'a']--;
        }
        return true;
    }
}
/**
 * 运行失败:
 * Time Limit Exceeded
 */