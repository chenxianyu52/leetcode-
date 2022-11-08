class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length == 0) {
            return new int[][]{{newInterval[0], newInterval[1]}};
        }
        ArrayList<int[]> list = new ArrayList<>();
        list.add(intervals[0]);
        boolean isInsert = false;
        for (int i = 1; i < intervals.length; i++) {
            int index = list.size() - 1;
            int[] current = list.get(index);
            int[] next = intervals[i];
            if (!isInsert) {
//                System.out.println("current: " + current[0] + ", 1: " + current[1]);
                if (newInterval[1] < current[0]) {
//                    System.out.println("11");
                    list.add(index, newInterval);
                    isInsert = true;
                } else if (newInterval[1] >= current[0] && newInterval[0] <= current[0]) {
//                    System.out.println("22");
                    current[0] = newInterval[0];
                    current[1] = Math.max(newInterval[1], current[1]);
                    isInsert = true;
                } else if (current[0] <= newInterval[0] && newInterval[0] <= current[1]) {
//                    System.out.println("33");
                    current[1] = Math.max(newInterval[1], current[1]);
                    isInsert = true;
                }
            }
            if (isInsert) {
                if (next[0] <= current[1]) {
                    current[1] = Math.max(current[1], next[1]);
                } else {
                    list.add(next);
                }
            } else {
                list.add(next);
            }
        }
        if (!isInsert) {
            int index = list.size() - 1;
            int[] current = list.get(index);
            if (newInterval[1] < current[0]) {
                list.add(index, newInterval);
            } else if (current[1] < newInterval[0]) {
                list.add(newInterval);
            } else {
                current[0] = Math.min(current[0], newInterval[0]);
                current[1] = Math.max(current[1], newInterval[1]);
            }
        }

        return list.toArray(new int[list.size()][]);
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了87.14% 的Java用户
 * 内存消耗:44.1 MB,击败了5.14% 的Java用户
 */