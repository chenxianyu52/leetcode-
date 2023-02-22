class Solution {
    Map<Integer, Double> map = new HashMap<>();
    Map<Integer, Integer> sumMap = new HashMap<>();
    int maxDepth = 0;

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        dfs(root, 0);
        for (int i = 0; i <= maxDepth; i++) {
            double d = map.get(i) / sumMap.get(i);
            result.add(d);
        }
        return result;
    }

    private void dfs(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        maxDepth = Math.max(maxDepth, depth);
        map.put(depth, map.getOrDefault(depth, 0D) + (double) root.val);
        sumMap.put(depth, sumMap.getOrDefault(depth, 0) + 1);
        dfs(root.left, depth + 1);
        dfs(root.right, depth + 1);
    }
}
/**
 * 解答成功:
 * 执行耗时:2 ms,击败了92.95% 的Java用户
 * 内存消耗:43.9 MB,击败了5.01% 的Java用户
 */