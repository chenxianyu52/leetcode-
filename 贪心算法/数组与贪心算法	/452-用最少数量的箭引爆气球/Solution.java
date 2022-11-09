class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] > o2[0]) {
                    return 1;
                }
                if (o1[0] < o2[0]) {
                    return -1;
                }
                if (o1[1] > o2[1]) {
                    return 1;
                }
                if (o1[1] < o2[1]) {
                    return -1;
                }
                return 0;
            }
        });
//        System.out.println("points[0][0]: " + points[0][0] + " , points[1][1]: "+ points[1][0] + " , < : " + (points[1][0] <= points[0][0]));

        int result = 0;
        int i = 0;
        while (i < points.length) {
            int start = i;
            i++;
            while (i < points.length && points[i][0] <= points[start][1]) {
                if (points[i][1] < points[start][1]) {
                    start = i;
                }

//                System.out.println("points[i][0]: " + points[i][0] + " , points[start][1]: " + points[start][1] + " , < : " + (points[i][0] <= points[start][1]));

                i++;
            }
//            System.out.println("i: " + i + " , start : " + start);
            result++;
        }
        return result;

    }
}
/**
 * 解答成功:
 * 执行耗时:63 ms,击败了16.00% 的Java用户
 * 内存消耗:77.2 MB,击败了73.25% 的Java用户
 */