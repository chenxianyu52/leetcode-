class Solution {
    public String tree2str(TreeNode root) {
        return dfs(root);
    }

    private String dfs(TreeNode root) {
        if (root == null) {
            return null;
        }
//        System.out.println("root.val: " + root.val);
        String left = dfs(root.left);
        String right = dfs(root.right);
//        System.out.println("left: " + left + " , right: " + right);
        StringBuilder sb = new StringBuilder();
        sb.append(root.val);
        if (left == null && right == null) {
            return sb.toString();
        } else if (left == null) {
            sb.append("()").append("(").append(right).append(")");
            return sb.toString();
        } else if (right == null) {
            sb.append("(").append(left).append(")");
            return sb.toString();
        } else {
            sb.append("(").append(left).append(")").append("(").append(right).append(")");
            return sb.toString();
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:5 ms,击败了42.94% 的Java用户
 * 内存消耗:41.7 MB,击败了35.95% 的Java用户
 */