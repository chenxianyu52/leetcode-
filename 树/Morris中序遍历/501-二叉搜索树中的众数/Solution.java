class Solution {
    List<Integer> result = new ArrayList<>();
    int preNumber = -100001;
    int preNumberSum = 0;
    int maxSum = 0;

    public int[] findMode(TreeNode root) {
        dfs(root);
        if (preNumberSum == maxSum && !result.contains(preNumber)) {
            result.add(preNumber);
        } else if (preNumberSum > maxSum) {
            result.clear();
            result.add(preNumber);
        }
        int len = result.size();
        int[] tt = new int[len];
        for (int i = 0; i < len; i++) {
            tt[i] = result.get(i);
        }
        return tt;
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        if (root.val == preNumber) {
            preNumberSum++;
        } else {
            if (preNumberSum > maxSum) {
                maxSum = preNumberSum;
                result.clear();
                result.add(preNumber);
            } else if (preNumberSum == maxSum) {
                maxSum = preNumberSum;
                result.add(preNumber);
            }
            preNumberSum = 1;
            preNumber = root.val;
        }
        dfs(root.right);
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:41.8 MB,击败了78.34% 的Java用户
 */