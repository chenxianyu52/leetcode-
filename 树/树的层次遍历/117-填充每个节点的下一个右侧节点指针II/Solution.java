class Solution {
    Map<Integer, Node> map = new HashMap<>();

    public Node connect(Node root) {
        dfs(root, 0);
        return root;
    }

    private void dfs(Node root, int depth) {
        if (root == null) {
            return;
        }

        if (map.containsKey(depth)) {
            Node parent = map.get(depth);
            parent.next = root;
        }
        map.put(depth, root);

        dfs(root.left, depth + 1);
        dfs(root.right, depth + 1);
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了67.03% 的Java用户
 * 内存消耗:41.1 MB,击败了57.21% 的Java用户
 */