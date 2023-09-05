class Solution {
    int maxDeep = 1;
    Map<Integer, Integer> map = new HashMap<>();

    public int deepestLeavesSum(TreeNode root) {
        dfs(root, 1);
        return map.get(maxDeep);
    }

    private void dfs(TreeNode root, int deep) {
        if (root == null) {
            return;
        }
        maxDeep = Math.max(maxDeep, deep);

        int value = map.getOrDefault(deep, 0) + root.val;
        map.put(deep, value);
        dfs(root.left, deep + 1);
        dfs(root.right, deep + 1);
    }
}
/**
 * 解答成功:
 * 执行耗时:5 ms,击败了59.95% 的Java用户
 * 内存消耗:44.6 MB,击败了5.04% 的Java用户
 */