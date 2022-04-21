class Solution {
    public int findMinDifference(List<String> timePoints) {
        int[] status = new int[1440];
        for (String time : timePoints) {
            String[] times = time.split(":");
            int hour = Integer.parseInt(times[0]);
            int minute = Integer.parseInt(times[1]);
            int sum = hour * 60 + minute;
            if (status[sum] > 0) {
                return 0;
            }
            status[sum]++;
        }

        int result = 1500;
        int pre = -1;
        int start = -1;
        for (int i = 0; i < 1440; i++) {
            if (status[i] == 0) {
                continue;
            }
            if (pre == -1) {
                pre = i;
                start = i;
            } else {
                result = Math.min(result, i - pre);
                pre = i;
            }
        }
        result = Math.min(result, start - pre + 1440);
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:2 ms,击败了92.05% 的Java用户
 * 内存消耗:40.7 MB,击败了8.28% 的Java用户
 */