class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String s : paths) {
            String[] strings = s.split(" ");
            for (int i = 1; i < strings.length; i++) {
                int startIndex = strings[i].indexOf("(");
                int endIndex = strings[i].length() - 1;
                String content = strings[i].substring(startIndex + 1, endIndex);
                List<String> value = map.getOrDefault(content, new ArrayList<String>());
                value.add(new StringBuffer().append(strings[0]).append("/").append(strings[i].substring(0, startIndex)).toString());
                map.put(content, value);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getValue().size() > 1) {
                result.add(entry.getValue());
            }
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:14 ms,击败了93.37% 的Java用户
 * 内存消耗:49.7 MB,击败了93.37% 的Java用户
 */