class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        for (int i = 0; i < m / 2; i++) {
            int len = m - 2 * i;
            for (int j = 0; j < (len - 1); j++) {
                // i=0,j=1;len = 4
                // (len - j+i-1,i)->(i,j + i)-> (j + i,len+i-1)->(len+i-1,len - j+i-1)->()
                // (2            ,0)->(0,1)    -> (1,     3)     ->(3,      2)        ->(2,0)

                // i = 1;j =0;len = 2
                // (2,1) -> (1,1) ->(1,2)->(2,2)
                int temp = matrix[i][j + i];
                matrix[i][j + i] = matrix[len - j + i - 1][i];
                matrix[len - j + i - 1][i] = matrix[len + i - 1][len - j + i - 1];
                matrix[len + i - 1][len - j + i - 1] = matrix[j + i][len + i - 1];
                matrix[j + i][len + i - 1] = temp;
            }
        }
    }
}
/**
 * 解答成功:
 * 					执行耗时:0 ms,击败了100.00% 的Java用户
 * 					内存消耗:39.8 MB,击败了63.29% 的Java用户
 */