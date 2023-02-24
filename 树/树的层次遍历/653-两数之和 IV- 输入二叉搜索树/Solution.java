class Solution {
    Set<Integer> set = new HashSet<>();
    boolean result = false;

    public boolean findTarget(TreeNode root, int k) {
        dfs(root, k);
        return result;

    }

    private void dfs(TreeNode root, int k) {
        if (root == null) {
            return;
        }
        if (set.contains(k - root.val)) {
            result = true;
            return;
        } else {
            set.add(root.val);
            dfs(root.left, k);
            dfs(root.right, k);
        }
    }

}
/**
 * 解答成功:
 * 执行耗时:3 ms,击败了42.37% 的Java用户
 * 内存消耗:42.1 MB,击败了35.78% 的Java用户
 */