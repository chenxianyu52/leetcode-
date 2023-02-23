class Solution {
    List<String> result = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root, "");
        return result;
    }

    private void dfs(TreeNode root, String ss) {
        if (root == null) {
            return;
        }
        StringBuilder sb = new StringBuilder(ss);
        if (sb.length() == 0) {
            sb.append(root.val);
        } else {
            sb.append("->").append(root.val);
        }
        if (root.left == null && root.right == null) {
            result.add(sb.toString());
            return;
        }
        if (root.left != null) {
            dfs(root.left, sb.toString());
        }
        if (root.right != null) {
            dfs(root.right, sb.toString());
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了100.00% 的Java用户
 * 内存消耗:41.7 MB,击败了50.39% 的Java用户
 */