class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        dfs(root, 0);
        return result;
    }

    private void dfs(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        if (result.size() == depth) {
            LinkedList<Integer> list = new LinkedList<>();
            result.add(list);
        }

        LinkedList<Integer> current = (LinkedList<Integer>) result.get(depth);
        if (depth % 2 == 0) {
            current.addLast(root.val);
        } else {
            current.addFirst(root.val);
        }

        dfs(root.left, depth + 1);
        dfs(root.right, depth + 1);
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:40.5 MB,击败了20.78% 的Java用户
 */