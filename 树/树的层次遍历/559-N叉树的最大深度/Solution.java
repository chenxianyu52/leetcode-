class Solution {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        List<Node> children = root.children;
        int maxDepth = 0;
        for (Node node : children) {
            int depth = maxDepth(node);
            maxDepth = Math.max(depth, maxDepth);
        }
        return maxDepth + 1;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:41.4 MB,击败了65.77% 的Java用户
 */