class Solution {
    int result = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        dfs(root);
        return result;
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        int a = root.val;
        if (root.left != null) {
            int left = getRightMax(root.left);
            result = Math.min(result, a - left);
        }
        if (root.right != null) {
            int right = getLeftMin(root.right);
            result = Math.min(result, right - a);
        }
        dfs(root.left);
        dfs(root.right);
    }

    private int getRightMax(TreeNode root) {
        if (root == null) {
            return -1;
        }
        if (root.right == null) {
            return root.val;
        } else {
            return getRightMax(root.right);
        }
    }

    private int getLeftMin(TreeNode root) {
        if (root == null) {
            return -1;
        }
        if (root.left == null) {
            return root.val;
        } else {
            return getLeftMin(root.left);
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了35.56% 的Java用户
 * 内存消耗:41.3 MB,击败了31.79% 的Java用户
 */