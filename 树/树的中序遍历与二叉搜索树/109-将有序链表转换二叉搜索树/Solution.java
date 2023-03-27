class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode p = head;
        while (p != null) {
            list.add(p.val);
            p = p.next;
        }
        return dfs(list, 0, list.size() - 1);

    }

    private TreeNode dfs(List<Integer> list, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (right + left) / 2;
        TreeNode parent = new TreeNode(list.get(mid));
        parent.left = dfs(list, left, mid - 1);
        parent.right = dfs(list, mid + 1, right);
        return parent;
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了24.83% 的Java用户
 * 内存消耗:42.6 MB,击败了58.22% 的Java用户
 */