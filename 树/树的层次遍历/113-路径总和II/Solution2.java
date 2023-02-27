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
//        List<Integer> temp = new ArrayList<>(list);
        list.add(root.val);
        int index = list.size() - 1;
        if (root.val == targetSum && root.left == null && root.right == null) {
            result.add(new ArrayList<>(list));
        }
//        System.out.println("root.val : " + root.val + " , targetSum: " + targetSum);
//        System.out.println("list: " + list);
        dfs(root.left, targetSum - root.val, list);
        dfs(root.right, targetSum - root.val, list);
        list.remove(index);
//        list.remove((Integer) root.val);
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了99.95% 的Java用户
 * 内存消耗:42.1 MB,击败了22.01% 的Java用户
 */