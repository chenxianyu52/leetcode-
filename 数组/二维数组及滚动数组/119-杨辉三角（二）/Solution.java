class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            ArrayList<Integer> currentRowResult = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    currentRowResult.add(1);
                } else {
                    currentRowResult.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
            }
            result.add(currentRowResult);
        }
        return result.get(rowIndex);
    }
}
/**
 * 解答成功:
 * 				执行耗时:1 ms,击败了78.48% 的Java用户
 * 				内存消耗:36 MB,击败了64.14% 的Java用户
 */