class Solution {
    Stack<Data> stack = new Stack<>();

    public int rob(TreeNode root) {
        return getMaxSum(root);
    }

    private int getMaxSum(TreeNode node) {
        if (node == null) {
            Data data = new Data();
            data.maxSum = 0;
            data.isMatch = false;
            data.currentNum = 0;
            stack.add(data);
            return 0;
        }
        Data data = new Data();
        data.currentNum = node.val;
//        System.out.println("node.val : " + node.val);
        int leftMaxSum = getMaxSum(node.left);
        int rightMaxSum = getMaxSum(node.right);
        Data leftData = stack.pop();
//        System.out.println("leftData is not null: " + leftData.maxSum + " , isMatch: " + leftData.isMatch);
        Data rightData = stack.pop();
//        System.out.println("rightData is not null: " + rightData.maxSum + " , isMatch: " + rightData.isMatch);
        int tempHasHead = node.val + (leftData.isMatch ? leftData.preMaxSum : leftData.maxSum) + (rightData.isMatch ? rightData.preMaxSum : rightData.maxSum);
        int tempNotHasHead = leftData.maxSum + rightData.maxSum;
        if (tempHasHead > tempNotHasHead) {
            data.maxSum = tempHasHead;
            data.isMatch = true;
            data.preMaxSum = leftMaxSum + rightMaxSum;
        } else {
            data.maxSum = tempNotHasHead;
            data.isMatch = false;
        }
//        System.out.println("node.val : " + node.val + ",node maxSum = " + data.maxSum + ", isMatch: " + data.isMatch);
        stack.add(data);
        return data.maxSum;
    }

    private static class Data {
        public boolean isMatch;
        public int maxSum;
        public int currentNum;
        public int preMaxSum;
    }
}
/**
 * 解答成功:
 * 执行耗时:3 ms,击败了17.78% 的Java用户
 * 内存消耗:41.3 MB,击败了5.08% 的Java用户
 */