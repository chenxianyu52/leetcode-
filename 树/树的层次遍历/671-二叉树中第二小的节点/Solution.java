class Solution {
    long minResult = Long.MAX_VALUE;

    public int findSecondMinimumValue(TreeNode root) {
        dfs(root, root.val);
        if (minResult == Long.MAX_VALUE) {
            return -1;
        }
        return (int) minResult;
    }

    private void dfs(TreeNode root, int min) {
        if (root == null) {
            return;
        }
        if (root.val > min) {
            minResult = Math.min(minResult, root.val);
        } else {
            dfs(root.left, min);
            dfs(root.right, min);
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:38.7 MB,击败了69.06% 的Java用户
 */