class Solution {
    public String[] findRelativeRanks(int[] score) {
        TreeMap<Integer, Integer> map = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        int len = score.length;
        for (int i = 0; i < len; i++) {
            map.put(score[i], i);
        }
        String[] result = new String[map.size()];
        int i = 1;
        for (Map.Entry entry : map.entrySet()) {
            int value = ((Integer) entry.getValue()).intValue();
            if (i == 1) {
                result[value] = "Gold Medal";
            } else if (i == 2) {
                result[value] = "Silver Medal";
            } else if (i == 3) {
                result[value] = "Bronze Medal";
            } else {
                result[value] = String.valueOf(i);
            }
            i++;
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:6 ms,击败了90.24% 的Java用户
 * 内存消耗:42.8 MB,击败了5.14% 的Java用户
 */