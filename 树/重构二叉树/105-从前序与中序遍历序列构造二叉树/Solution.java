class Solution {
    Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int len = preorder.length;
        for (int i = 0; i < len; i++) {
            map.put(inorder[i], i);
        }
        return dfs(preorder, 0, len - 1, inorder, 0, len - 1);
    }

    private TreeNode dfs(int[] preorder, int left, int right, int[] inorder, int left2, int right2) {
        if (left > right) {
            return null;
        }
//        System.out.println("left: " + left + ", right: " + right);
        int head = preorder[left];
//        System.out.println(head);
        int headInInorder = map.get(head);
        int subSize = headInInorder - left2;
        TreeNode node = new TreeNode(head);
        node.left = dfs(preorder, left + 1, left + subSize, inorder, left2, headInInorder - 1);
        node.right = dfs(preorder, left + subSize + 1, right, inorder, headInInorder + 1, right2);
        return node;
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了99.21% 的Java用户
 * 内存消耗:41 MB,击败了80.50% 的Java用户
 */