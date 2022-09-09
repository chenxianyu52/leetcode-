class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < wall.size(); i++) {
            int sum = 0;
            for (int j = 0; j < wall.get(i).size() - 1; j++) {
                int wallJValue = wall.get(i).get(j);
                int value = map.getOrDefault(wallJValue + sum, 0);
                map.put(wallJValue + sum, value + 1);
//                System.out.println("index: "+ (wall.get(i).get(j) + sum) + ",value: "+ status[wall.get(i).get(j) + sum]);
                sum += wallJValue;
            }
        }
        int max = 0;
        for (Map.Entry entry : map.entrySet()) {
            max = Math.max(max, map.get(entry.getKey()));
        }
        return wall.size() - max;
    }
}
/**
 * 解答成功:
 * 执行耗时:14 ms,击败了34.60% 的Java用户
 * 内存消耗:45.4 MB,击败了9.30% 的Java用户
 */