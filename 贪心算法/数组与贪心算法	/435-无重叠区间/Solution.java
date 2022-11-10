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
                    if (o1[1] > o2[1]) {
                        return 1;
                    } else if (o1[1] < o2[1]) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            }
        });
        int i = 0;
        int len = intervals.length;
        int result = 0;
        while (i < len) {
            int start = i;
            i++;
            while (i < len) {
//                System.out.println("start: " + intervals[start][0] + " , " + intervals[start][1]);
//                System.out.println("i : " + intervals[i][0] + ", " + intervals[i][1]);
                if (intervals[i][0] >= intervals[start][1]) {
                    break;
                }
                if (intervals[i][0] == intervals[start][0]) {
                    result++;
                    i++;
                    continue;
                }
                if (intervals[i][1] < intervals[start][1]) {
                    result++;
                    start = i;
                    i++;
                    continue;
                }
                if (intervals[i][0] < intervals[start][1]) {
                    result++;
                    i++;
                    continue;
                }
            }

        }
        return result;


    }
}
/**
 * 解答成功:
 * 执行耗时:74 ms,击败了5.63% 的Java用户
 * 内存消耗:97.9 MB,击败了42.83% 的Java用户
 */