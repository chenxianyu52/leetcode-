class Solution {
    Map<Integer, Integer> map = new HashMap<>();
    int maxSum = 0;

    public int[] findFrequentTreeSum(TreeNode root) {
        findChildSum(root);
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxSum) {
                list.add(entry.getKey());
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    private int findChildSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = findChildSum(root.left);
        int right = findChildSum(root.right);
        int sum = left + right + root.val;
        int count = map.getOrDefault(sum, 0) + 1;
        map.put(sum, count);
        maxSum = Math.max(maxSum, count);
        return sum;
    }
}
/**
 * 解答成功:
 * 执行耗时:3 ms,击败了94.15% 的Java用户
 * 内存消耗:42 MB,击败了22.93% 的Java用户
 */