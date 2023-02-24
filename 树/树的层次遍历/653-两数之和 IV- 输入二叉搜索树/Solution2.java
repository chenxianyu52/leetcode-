class Solution {
    Set<Integer> set = new HashSet<>();
    boolean result = false;

    public boolean findTarget(TreeNode root, int k) {
        return dfs(root, k);

    }

    private boolean dfs(TreeNode root, int k) {
        if (root == null) {
            return false;
        }
        if (set.contains(k - root.val)) {
            return true;
        } else {
            set.add(root.val);
            return dfs(root.left, k) || dfs(root.right, k);
        }
    }

}
/**
 * 解答成功:
 * 执行耗时:2 ms,击败了96.37% 的Java用户
 * 内存消耗:42 MB,击败了47.15% 的Java用户
 */