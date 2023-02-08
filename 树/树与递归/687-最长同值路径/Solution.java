class Solution {
    int max = 0;

    public int longestUnivaluePath(TreeNode root) {
        dfs(root);
        return max;
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int childSum = 0;
        int temp = 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        if (root.left != null && root.val == root.left.val) {
            childSum = left + 1;
            temp += (left + 1);
        }
        if (root.right != null && root.val == root.right.val) {
            childSum = Math.max(childSum, right + 1);
            temp += (right + 1);
        }
        max = Math.max(max, temp);
        return childSum;

    }
}
/**
 * 解答成功:
 * 执行耗时:2 ms,击败了97.59% 的Java用户
 * 内存消耗:45.2 MB,击败了20.18% 的Java用户
 */