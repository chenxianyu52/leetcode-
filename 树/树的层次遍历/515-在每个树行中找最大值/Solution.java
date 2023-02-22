class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList();
        if (root == null) {
            return result;
        }
        Deque<TreeNode> deque = new ArrayDeque();
        deque.addLast(root);
        int dequeSize = 1;
        while (!deque.isEmpty()) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < dequeSize; i++) {
                TreeNode top = deque.pollFirst();
                max = Math.max(top.val, max);
                if (top.left != null) {
                    deque.addLast(top.left);
                }
                if (top.right != null) {
                    deque.addLast(top.right);
                }
            }
            dequeSize = deque.size();
            result.add(max);
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:2 ms,击败了85.06% 的Java用户
 * 内存消耗:41.5 MB,击败了81.83% 的Java用户
 */