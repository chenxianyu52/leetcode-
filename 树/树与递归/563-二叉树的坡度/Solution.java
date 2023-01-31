class Solution {
    private int res = 0;

    public int findTilt(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = findChildSum(root.left);
        int right = findChildSum(root.right);
        int cha = Math.abs(left - right);
        res += cha;
        return res;

    }

    private int findChildSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftSum = findChildSum(root.left);
        int rightSum = findChildSum(root.right);
        int cha = Math.abs(leftSum - rightSum);
        res += cha;
        return leftSum + rightSum + root.val;
    }

}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:41.5 MB,击败了36.65% 的Java用户
 */