class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> results = new ArrayList<Integer>();
        int n = matrix.length;
        int m = matrix[0].length;
        if (n == 0) {
            return results;
        }
        int left = 0;
        int top = 0;
        int right = m - 1;
        int bottom = n - 1;
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                results.add(matrix[top][i]);
            }
            for (int i = top + 1; i <= bottom; i++) {
                results.add(matrix[i][right]);
            }
            if (top < bottom && left < right) {
                for (int i = right - 1; i >= left; i--) {
                    results.add(matrix[bottom][i]);
                }

                for (int i = bottom - 1; i > top; i--) {
                    results.add(matrix[i][left]);
                }
            }
            left++;
            top++;
            right--;
            bottom--;

        }
        return results;
    }
}
/**
 * 解答成功:
 * 				执行耗时:0 ms,击败了100.00% 的Java用户
 * 				内存消耗:39.5 MB,击败了23.97% 的Java用户
 */