class Solution {
    List<Integer> result = new ArrayList<>();

    public List<Integer> postorder(Node root) {
        dfs(root);
        return result;
    }

    private void dfs(Node root) {
        if (root == null) {
            return;
        }

        List<Node> list = root.children;
        for (int i = 0; i < list.size(); i++) {
            dfs(list.get(i));
        }
        result.add(root.val);
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:42.1 MB,击败了74.95% 的Java用户
 */