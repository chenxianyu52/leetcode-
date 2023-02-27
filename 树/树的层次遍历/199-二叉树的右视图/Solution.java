class Solution {
    Map<Integer, Integer> map = new HashMap<>();
    int maxDepth = 0;

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        dfs(root, 0);
        for (int i = 0; i <= maxDepth; i++) {
            result.add(map.get(i));
        }
        return result;
    }

    private void dfs(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        map.put(depth, root.val);
        maxDepth = Math.max(depth, maxDepth);
        dfs(root.left, depth + 1);
        dfs(root.right, depth + 1);
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了81.64% 的Java用户
 * 内存消耗:40.5 MB,击败了13.01% 的Java用户
 */