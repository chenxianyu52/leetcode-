class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int index = 0;
        for (int i = 1; i < intervals.length; i++) {
            int[] intervalLast = intervals[index];
            int[] current = intervals[i];
            if (current[0] >= intervalLast[0] && current[0] <= intervalLast[1]) {
                current[1] = Math.max(current[1], intervalLast[1]);
                current[0] = intervalLast[0];
                intervals[index] = current;
            } else {
                index++;
                intervals[index] = current;
            }
        }
        int[][] result = new int[index + 1][2];
        for (int i = 0; i <= index; i++) {
            result[i] = intervals[i];
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:6 ms,击败了97.68% 的Java用户
 * 内存消耗:46.7 MB,击败了11.47% 的Java用户
 */