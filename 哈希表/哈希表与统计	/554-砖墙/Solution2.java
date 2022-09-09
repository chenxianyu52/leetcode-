class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < wall.size(); i++) {
            int sum = 0;
            for (int j = 0; j < wall.get(i).size() - 1; j++) {
                int wallJValue = wall.get(i).get(j);
                sum += wallJValue;
                int value = map.getOrDefault(sum, 0);
                map.put(sum, value + 1);
                max = Math.max(value + 1, max);
//                System.out.println("index: "+ (wall.get(i).get(j) + sum) + ",value: "+ status[wall.get(i).get(j) + sum]);
            }
        }
        return wall.size() - max;
    }
}
/**
 * 解答成功:
 * 执行耗时:13 ms,击败了49.88% 的Java用户
 * 内存消耗:44.8 MB,击败了54.01% 的Java用户
 */