class Solution {
    Map<String, Integer> map = new HashMap<>();
    List<TreeNode> result = new ArrayList<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        dfs(root);
        return result;
    }

    private String dfs(TreeNode root) {
        if (root == null) {
            return " ";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(root.val).append("_").append(dfs(root.left)).append(dfs(root.right));
        String key = sb.toString();
        map.put(key, map.getOrDefault(key, 0) + 1);
        if (map.get(key) == 2) {
            result.add(root);
        }
        return key;
    }
}
/**
 * 解答成功:
 * 执行耗时:8 ms,击败了94.57% 的Java用户
 * 内存消耗:47.8 MB,击败了70.13% 的Java用户
 */