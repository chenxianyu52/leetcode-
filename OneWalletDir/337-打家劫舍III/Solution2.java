class Solution {
    public int rob(TreeNode root) {
        int[] curSums = getMaxSum(root);
        return Math.max(curSums[0], curSums[1]); // 0 为选root，1为不选root
    }

    private int[] getMaxSum(TreeNode node) {
        if (node == null) {
            return new int[]{0, 0};
        }
        int[] leftSums = getMaxSum(node.left);
        int[] rightSums = getMaxSum(node.right);
        int[] currentSums = new int[2];
        currentSums[0] = node.val + leftSums[1] + rightSums[1];
        currentSums[1] = Math.max(leftSums[0], leftSums[1]) + Math.max(rightSums[0], rightSums[1]);
        return currentSums;

    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:40.7 MB,击败了85.07% 的Java用户
 */