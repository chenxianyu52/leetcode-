class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] > o2[1]) {
                    return 1;
                }
                if (o1[1] < o2[1]) {
                    return -1;
                }
                return 0;
            }
        });

        int result = 1;
        int pointRight = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > pointRight) {
                result++;
                pointRight = points[i][1];
            }
        }
        return result;

    }
}
/**
 * 解答成功:
 * 执行耗时:52 ms,击败了97.22% 的Java用户
 * 内存消耗:77.3 MB,击败了64.49% 的Java用户
 */