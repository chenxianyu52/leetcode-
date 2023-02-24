class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int minLeft = minDepth(root.left);
        int minRight = minDepth(root.right);
        if (minLeft > 0 && minRight > 0) {
            return Math.min(minLeft, minRight) + 1;
        } else if (minLeft == 0) {
            return minRight + 1;
        } else {
            return minLeft + 1;
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:14 ms,击败了7.23% 的Java用户
 * 内存消耗:61 MB,击败了61.67% 的Java用户
 */