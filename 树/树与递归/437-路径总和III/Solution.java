class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        int res = rootPath(root, targetSum);
        res += pathSum(root.left, targetSum);
        res += pathSum(root.right, targetSum);
        return res;
    }

    private int rootPath(TreeNode root, long targetSum) {
        if (root == null) {
            return 0;
        }
        int res = 0;
        if ((long) root.val == targetSum) {
            res++;
        }
        return res + rootPath(root.left, targetSum - (long) root.val) + rootPath(root.right, targetSum - (long)root.val);
    }
}
/**
 * 解答成功:
 * 执行耗时:39 ms,击败了5.74% 的Java用户
 * 内存消耗:40.9 MB,击败了80.81% 的Java用户
 */