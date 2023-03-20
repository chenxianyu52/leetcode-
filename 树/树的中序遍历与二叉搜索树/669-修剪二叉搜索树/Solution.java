class Solution {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) {
            return null;
        }
        TreeNode tempRoot = root;
        while (tempRoot != null && (tempRoot.val < low || tempRoot.val > high)) {
            tempRoot = (tempRoot.val < low) ? tempRoot.right : tempRoot.left;
        }

        TreeNode ans = tempRoot;

        while (tempRoot != null) {
            while (tempRoot.left != null && tempRoot.left.val < low) {
                tempRoot.left = tempRoot.left.right;
            }
            tempRoot = tempRoot.left;
        }

        tempRoot = ans;


        while (tempRoot != null) {
            while (tempRoot.right != null && tempRoot.right.val > high) {
                tempRoot.right = tempRoot.right.left;
            }
            tempRoot = tempRoot.right;
        }
        return ans;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:40.9 MB,击败了77.31% 的Java用户
 */