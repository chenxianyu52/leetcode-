class Solution {
    TreeNode t1;
    TreeNode t2;
    TreeNode preValue = new TreeNode(Integer.MIN_VALUE);
    public void recoverTree(TreeNode root) {
        dfs(root);
        int temp = t1.val;
        t1.val = t2.val;
        t2.val = temp;
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        if (t1 == null && preValue.val > root.val) {
            t1 = preValue;
        }
        if (t1 != null && preValue.val > root.val) {
            t2 = root;
        }
        preValue = root;
        dfs(root.right);
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了100.00% 的Java用户
 * 内存消耗:41.4 MB,击败了72.81% 的Java用户
 */