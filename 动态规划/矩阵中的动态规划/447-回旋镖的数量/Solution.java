class Solution {
    public int numberOfBoomerangs(int[][] points) {
        if (points.length < 3) {
            return 0;
        }

        int len = points.length;
        int result = 0;
        for (int i = 0; i < len; i++) {
            Map<Double, Integer> map = new HashMap<>();
            for (int j = 0; j < len; j++) {
                if (i != j) {
                    double len1 = getLen(points[i], points[j]);
                    int sum = map.getOrDefault(len1, 0);
                    map.put(len1, sum + 1);
                }
            }

            for (Map.Entry<Double, Integer> entry : map.entrySet()) {
                if (entry.getValue() > 1) {
                    result += (entry.getValue() * (entry.getValue() - 1));
                }
            }

        }
        return result;

    }

    private double getLen(int[] point1, int[] point2) {
        return Math.sqrt((point1[0] - point2[0]) * (point1[0] - point2[0]) + (point1[1] - point2[1]) * (point1[1] - point2[1]));
    }
}
/**
 * 执行耗时:162 ms,击败了30.04% 的Java用户
 * 内存消耗:43.5 MB,击败了77.58% 的Java用户
 */