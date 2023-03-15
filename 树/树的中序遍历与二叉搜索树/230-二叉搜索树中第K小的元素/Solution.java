class Solution {
    int index = 1;
    int result = Integer.MAX_VALUE;

    public int kthSmallest(TreeNode root, int k) {
        dfs(root, k);
        return result;
    }

    private void dfs(TreeNode root, int k) {
        if (root == null) {
            return;
        }
        dfs(root.left, k);
//        System.out.println("root.val" + root.val);
        if (index == k) {
            result = root.val;
            index++;
        } else {
            index++;
        }

        dfs(root.right, k);
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:41.2 MB,击败了69.20% 的Java用户
 */