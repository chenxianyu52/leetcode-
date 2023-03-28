class Solution {
    Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int len = inorder.length;
        for (int i = 0; i < len; i++) {
            map.put(inorder[i], i);
        }
        return dfs(inorder, 0, len - 1, postorder, 0, len - 1);
    }

    private TreeNode dfs(int[] inorder, int inLeft, int inRight, int[] postorder, int postLeft, int postRight) {
        if (postLeft > postRight) {
            return null;
        }
//        System.out.println("postLeft: " + postLeft + " , postRight: " + postRight) ;
        int rootValue = postorder[postRight];
        int rootIndexInInorder = map.get(rootValue);
        int childSum = rootIndexInInorder - inLeft;
        TreeNode node = new TreeNode(rootValue);
        node.left = dfs(inorder, inLeft, rootIndexInInorder - 1, postorder, postLeft, postLeft + childSum - 1);
        node.right = dfs(inorder, rootIndexInInorder + 1, inRight, postorder, postLeft + childSum, postRight - 1);
        return node;
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了99.22% 的Java用户
 * 内存消耗:41.2 MB,击败了47.07% 的Java用户
 */