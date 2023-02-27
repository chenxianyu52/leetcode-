class Solution {
    int result = 0;

    public int sumNumbers(TreeNode root) {
        dfs(root, "");
        return result;
    }

    private void dfs(TreeNode root, String s) {
        if (root == null) {
            return;
        }
        StringBuilder sb = new StringBuilder(s);
        sb.append(root.val);
        if (root.left == null && root.right == null) {
            result += Integer.parseInt(sb.toString());
        }
        dfs(root.left, sb.toString());
        dfs(root.right, sb.toString());
    }

}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:39.4 MB,击败了25.61% 的Java用户
 */