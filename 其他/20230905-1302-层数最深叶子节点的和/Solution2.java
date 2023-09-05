class Solution {
    int maxDeep = 1;
    int result = 0;

    public int deepestLeavesSum(TreeNode root) {
        dfs(root, 1);
        return result;
    }

    private void dfs(TreeNode root, int deep) {
        if (root == null) {
            return;
        }
        if (deep > maxDeep) {
            maxDeep = deep;
            result = root.val;
        } else if (deep == maxDeep) {
            result += root.val;
        }
        dfs(root.left, deep + 1);
        dfs(root.right, deep + 1);
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了100.00% 的Java用户
 * 内存消耗:43.6 MB,击败了87.19% 的Java用户
 */