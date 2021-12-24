class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int result = 0;
        // 从后往前遍历
        for (int i = timeSeries.length - 1; i >= 0; i--) {
            if (i == timeSeries.length - 1) {
                result += duration;
            } else {
                int cha = timeSeries[i + 1] - timeSeries[i];
                result += (cha < duration ? cha : duration);
            }
        }
        return result;
    }
}