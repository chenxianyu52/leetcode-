class BSTIterator {
    List<Integer> list = new ArrayList<>();

    int index = 0;

    public BSTIterator(TreeNode root) {
        dfs(root);
    }

    public int next() {
        int result = list.get(index++);
        return result;
    }

    public boolean hasNext() {
        return index < list.size();
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        list.add(root.val);
        dfs(root.right);
    }
}
/**
 * 解答成功:
 * 执行耗时:16 ms,击败了95.11% 的Java用户
 * 内存消耗:45.4 MB,击败了31.35% 的Java用户
 */