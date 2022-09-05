class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        int minIndex = Integer.MAX_VALUE;
        List<String> result = new ArrayList<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                if (i + map.get(list2[i]) < minIndex) {
                    result.clear();
                    result.add(list2[i]);
                    minIndex = i + map.get(list2[i]);
                } else if (i + map.get(list2[i]) == minIndex) {
                    result.add(list2[i]);
                }
            }
        }
        return result.stream().toArray(String[]::new);
    }
}
/**
 * 解答成功:
 * 执行耗时:10 ms,击败了36.49% 的Java用户
 * 内存消耗:42.2 MB,击败了40.31% 的Java用户
 */