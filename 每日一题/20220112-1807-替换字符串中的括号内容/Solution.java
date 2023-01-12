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
            i++;

            StringBuilder sb = new StringBuilder();
            while (i < len && chars[i] != ')') {
                sb.append(chars[i]);
                i++;
            }
            i++;
            String key = sb.toString();
            if (map.containsKey(key)) {
                result.append(map.get(key));
            } else {
                result.append('?');
            }
        }
        return result.toString();

    }
}
/**
 * 解答成功:
 * 执行耗时:55 ms,击败了18.33% 的Java用户
 * 内存消耗:77.7 MB,击败了97.22% 的Java用户
 */