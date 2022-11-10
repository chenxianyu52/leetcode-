class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] > o2[0]) {
                    return 1;
                } else if (o1[0] < o2[0]) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        int i = 0;
        int len = intervals.length;
        int result = 0;
        while (i < len) {
            int start = i;
            i++;
            while (i < len && intervals[i][0] < intervals[start][1]) {
                if (intervals[i][1] < intervals[start][1]) {
                    start = i;
                }
                i++;
                result++;
            }

        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:49 ms,击败了63.03% 的Java用户
 * 内存消耗:98.2 MB,击败了13.90% 的Java用户
 */