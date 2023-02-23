class Solution {
    Map<Integer, List<Integer>> map = new HashMap<>();
    int maxLenth = 0;

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> result = new LinkedList();
        if (root == null) {
            return result;
        }
        dfs(root, 0);
        for (int i = 0; i <= maxLenth; i++) {
            result.addFirst(map.get(i));
        }
        return result;
    }

    private void dfs(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        List<Integer> list = map.getOrDefault(depth, new ArrayList<>());
        list.add(root.val);
        map.put(depth, list);
        maxLenth = Math.max(maxLenth, depth);
        dfs(root.left, depth + 1);
        dfs(root.right, depth + 1);
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了91.17% 的Java用户
 * 内存消耗:42 MB,击败了5.37% 的Java用户
 */