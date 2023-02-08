class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Deque<TreeNode> queque = new ArrayDeque<TreeNode>();
        queque.offerLast(root);
        int sum = 1;
        while (!queque.isEmpty()) {
            int temp = 0;
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < sum; i++) {
                TreeNode pre = queque.pollFirst();
                list.add(pre.val);
                if (pre.left != null) {
                    queque.offerLast(pre.left);
                    temp++;
                }
                if (pre.right != null) {
                    queque.offerLast(pre.right);
                    temp++;
                }
            }
            result.add(list);
            sum = temp;
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了60.26% 的Java用户
 * 内存消耗:42.1 MB,击败了5.01% 的Java用户
 */