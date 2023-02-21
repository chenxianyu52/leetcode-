class Solution {
    Map<Integer, Integer> map = new HashMap<>();
    int result = 0;

    public int widthOfBinaryTree(TreeNode root) {
        dfs(root, 1, 0);
        return result;
    }

    private void dfs(TreeNode root, int num, int depth) {
        if (root == null) {
            return;
        }
        if (!map.containsKey(depth)) {
            map.put(depth, num);
        }
        result = Math.max(result, num - map.get(depth) + 1);
        dfs(root.left, num << 1, depth + 1);
        dfs(root.right, num << 1 | 1, depth + 1);
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了99.48% 的Java用户
 * 内存消耗:41.1 MB,击败了57.28% 的Java用户
 */