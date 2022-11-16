class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                } else {
                    return o2[0] - o1[0];
                }
            }
        });
        List<int[]> result = new ArrayList();
        for (int i = 0; i < people.length; i++) {
            result.add(people[i][1], people[i]);
        }
        return result.toArray(new int[people.length][]);
    }
}
/**
 * 解答成功:
 * 执行耗时:5 ms,击败了99.65% 的Java用户
 * 内存消耗:42.3 MB,击败了48.06% 的Java用户
 */