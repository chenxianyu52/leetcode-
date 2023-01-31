class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
            return root2;
        }
        if (root2 == null) {
            return root1;
        }
        TreeNode newTree = new TreeNode(root1.val + root2.val);
        newTree.left = mergeTrees(root1.left, root2.left);
        newTree.right = mergeTrees(root1.right, root2.right);
        return newTree;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:41.4 MB,击败了66.00% 的Java用户
 */