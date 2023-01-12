class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < knowledge.size(); i++) {
            String key = knowledge.get(i).get(0);
            String value = knowledge.get(i).get(1);
            map.put(key, value);
        }
        char[] chars = s.toCharArray();
        int len = chars.length;
        int i = 0;
        StringBuilder result = new StringBuilder();
        while (i < len) {
            if (i < len && chars[i] != '(') {
                result.append(chars[i]);
                i++;
                continue;
            }
            int j = i + 1;
            while (j < len && chars[j] != ')') {
                j++;
            }
            String key = s.substring(i + 1, j);
            if (map.containsKey(key)) {
                result.append(map.get(key));
            } else {
                result.append('?');
            }
            i = j + 1;
        }
        return result.toString();

    }
}
/**
 * 解答成功:
 * 执行耗时:29 ms,击败了97.22% 的Java用户
 * 内存消耗:80.2 MB,击败了27.22% 的Java用户
 */