class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        Map<Long, Integer> map = new HashMap<>();
        map.put(0L, 1);
        return dfs(root, map, 0, targetSum);
    }

    private int dfs(TreeNode root, Map<Long, Integer> map, long current, int targetSum) {
        if (root == null) {
            return 0;
        }
        int res = 0;
        current += root.val;
        System.out.println();
        res += map.getOrDefault(current - targetSum, 0);
        map.put(current, map.getOrDefault(current, 0) + 1);
        res += dfs(root.left, map, current, targetSum);
        res += dfs(root.right, map, current, targetSum);
        map.put(current, map.getOrDefault(current, 0) - 1);
        return res;


    }
}
/**
 * 解答成功:
 * 执行耗时:2 ms,击败了100.00% 的Java用户
 * 内存消耗:41.5 MB,击败了11.90% 的Java用户
 */