class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root, targetSum, new ArrayList<>());
        return result;

    }

    private void dfs(TreeNode root, int targetSum, List<Integer> list) {
        if (root == null) {
            return;
        }
        List<Integer> temp = new ArrayList<>(list);
        temp.add(root.val);
        if (root.val == targetSum && root.left == null && root.right == null) {
            result.add(temp);
        }
//        System.out.println("root.val : " + root.val + " , targetSum: " + targetSum);
//        System.out.println("list: " + list);
        dfs(root.left, targetSum - root.val, temp);
        dfs(root.right, targetSum - root.val, temp);
//        list.remove((Integer) root.val);
    }
}
/**
 * 解答成功:
 * 执行耗时:2 ms,击败了14.20% 的Java用户
 * 内存消耗:44.3 MB,击败了5.01% 的Java用户
 */