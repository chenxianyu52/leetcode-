class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length == 0) {
            return new int[][]{{newInterval[0], newInterval[1]}};
        }
        int[][] newIntervals = Arrays.copyOf(intervals, intervals.length + 1);
        newIntervals[intervals.length] = newInterval;
        Arrays.sort(newIntervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
//        System.out.println("newIntervals size : " + newIntervals.length);

        ArrayList<int[]> list = new ArrayList<>();
        list.add(newIntervals[0]);

        for (int i = 1; i < newIntervals.length; i++) {
            int index = list.size() - 1;
            int[] fromList = list.get(index);
            int[] fromArray = newIntervals[i];
//            System.out.println("fromList[0]: " + fromList[0] + " , fromArray[0]: " + fromArray[0] + " , fromList[1]:" + fromList[1]) ;
            if (fromList[0] <= fromArray[0] && fromArray[0] <= fromList[1]) {
                fromList[1] = Math.max(fromList[1], fromArray[1]);
//                System.out.println("11:" + fromList[1]);
            } else {
//                System.out.println("22:" + fromArray[1]);
                list.add(fromArray);
            }
        }
        return list.toArray(new int[list.size()][]);

    }
}
/**
 * 解答成功:
 * 执行耗时:3 ms,击败了13.25% 的Java用户
 * 内存消耗:43.3 MB,击败了96.39% 的Java用户
 */