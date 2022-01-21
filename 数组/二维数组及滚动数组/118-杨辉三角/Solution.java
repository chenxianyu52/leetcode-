class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> lastRowResult = new ArrayList<>();
        lastRowResult.add(1);
        result.add(lastRowResult);
        for (int i = 2; i <= numRows; i++) {
            ArrayList<Integer> currentRowResult = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    currentRowResult.add(1);
                } else {
                    currentRowResult.add(lastRowResult.get(j - 1) + lastRowResult.get(j));
                }
            }
            result.add(currentRowResult);
            lastRowResult = currentRowResult;
        }
        return result;
    }
}
/**
 * 解答成功:
 * 				执行耗时:0 ms,击败了100.00% 的Java用户
 * 				内存消耗:36.4 MB,击败了24.98% 的Java用户
 */