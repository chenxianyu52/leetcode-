class Solution {
    public String frequencySort(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : chars) {
            int sum = map.getOrDefault(c, 0);
            sum++;
            map.put(c, sum);
        }
        ArrayList<Map.Entry<Character, Integer>> list = new ArrayList<Map.Entry<Character, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : list) {
            int sum = entry.getValue().intValue();
            for (int i = 0; i < sum; i++) {
                sb.append(entry.getKey());
            }
        }
        return sb.toString();
    }
}
/**
 * 解答成功:
 * 执行耗时:15 ms,击败了51.86% 的Java用户
 * 内存消耗:42.2 MB,击败了38.52% 的Java用户
 */