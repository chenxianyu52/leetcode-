class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // 输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
        //输出: [["bat"],["nat","tan"],["ate","eat","tea"]]

        Map<String, List<String>> map = new HashMap<>();

        for (String string : strs) {
            char[] chars = string.toCharArray();
            Arrays.sort(chars);
            String stringWithSort = new String(chars);
            List<String> stringList = map.getOrDefault(stringWithSort, new ArrayList<String>());
            stringList.add(string);
            map.put(stringWithSort, stringList);
        }
        return new ArrayList<List<String>>(map.values());

    }
}
/**
 * 解答成功:
 * 执行耗时:6 ms,击败了83.60% 的Java用户
 * 内存消耗:43.9 MB,击败了80.50% 的Java用户
 */