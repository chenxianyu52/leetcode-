class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        int minIndex = Integer.MAX_VALUE;
        String[] result = new String[list1.length];
        int resultLength = 0;
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        int start = 0;
        int end = list2.length - 1;
        while (start <= end) {
            if (map.containsKey(list2[start])) {
                if (end + map.get(list2[start]) < minIndex) {
                    result[0] = list2[start];
                    resultLength = 1;
                    minIndex = start + map.get(list2[start]);
                } else if (start + map.get(list2[start]) == minIndex) {
                    result[resultLength++] = list2[start];
                }
            }
            if (end != start) {
                if (map.containsKey(list2[end])) {
                    if (end + map.get(list2[end]) < minIndex) {
                        result[0] = list2[end];
                        resultLength = 1;
                        minIndex = end + map.get(list2[end]);
                    } else if (end + map.get(list2[end]) == minIndex) {
                        result[resultLength++] = list2[end];
                    }
                }
            }

            start++;
            end--;
        }
        return Arrays.copyOf(result, resultLength);
    }
}
/**
 * 解答成功:
 * 执行耗时:8 ms,击败了69.30% 的Java用户
 * 内存消耗:42.1 MB,击败了51.02% 的Java用户
 */