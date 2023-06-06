class Solution {
    List<String> result = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        dfs(n, n, "");
        return result;
    }

    private void dfs(int leftSum, int rightSum, String s) {
        if (leftSum == 0 && rightSum == 0) {
            result.add(s);
            return;
        }
        if (leftSum < 0 || rightSum < 0) {
            return;
        }

        if (leftSum >= rightSum) {
            dfs(leftSum - 1, rightSum, s + "(");
        } else {
            if (leftSum > 0) {
                dfs(leftSum - 1, rightSum, s + "(");
            }
            dfs(leftSum, rightSum - 1, s + ")");
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了75.37% 的Java用户
 * 内存消耗:41.5 MB,击败了60.97% 的Java用户
 */