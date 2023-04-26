class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }

        String[] result = new String[names.length];
        int i = 0;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            result[i++] = entry.getValue();
        }
        return result;

    }
}
/**
 * 解答成功:
 * 执行耗时:7 ms,击败了68.78% 的Java用户
 * 内存消耗:42.1 MB,击败了47.07% 的Java用户
 */