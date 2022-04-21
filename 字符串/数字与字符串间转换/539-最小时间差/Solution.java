class Solution {
    public int findMinDifference(List<String> timePoints) {
        Collections.sort(timePoints, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] times1 = o1.split(":");
                String[] times2 = o2.split(":");
                int time1Hour = Integer.parseInt(times1[0]);
                int time1Minute = Integer.parseInt(times1[1]);
                int time2Hour = Integer.parseInt(times2[0]);
                int time2Minute = Integer.parseInt(times2[1]);
                if (time1Hour == time2Hour) {
                    return time1Minute - time2Minute;
                } else {
                    return time1Hour - time2Hour;
                }
            }
        });

        int result = Integer.MAX_VALUE;
        int len = timePoints.size();
        for (int i = 0; i < len; i++) {
            int current = i;
            int pre = (i + len - 1) % len;
            int min = cut(timePoints.get(current), timePoints.get(pre));
            result = Math.min(min, result);
        }
        return result;
    }

    private int cut(String string1, String string2) {
        String[] currentTimes = string1.split(":");
        int currentHour = Integer.parseInt(currentTimes[0]);
        int currentMinute = Integer.parseInt(currentTimes[1]);
        String[] preTime = string2.split(":");
        int preHour = Integer.parseInt(preTime[0]);
        int preMinute = Integer.parseInt(preTime[1]);
        int result = 0;
        if (currentMinute >= preMinute) {
            int minuteCut = currentMinute - preMinute;
            if (currentHour >= preHour) {
                result = minuteCut + (currentHour - preHour) * 60;
            } else {
                result = minuteCut + (currentHour + 24 - preHour) * 60;
            }
        } else {
            int minuteCut = currentMinute + 60 - preMinute;
            if (currentHour - 1 >= preHour) {
                result = minuteCut + (currentHour - 1 - preHour) * 60;
            } else {
                result = minuteCut + (currentHour - 1 + 24 - preHour) * 60;
            }
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:91 ms,击败了5.03% 的Java用户
 * 内存消耗:43.2 MB,击败了5.02% 的Java用户
 */