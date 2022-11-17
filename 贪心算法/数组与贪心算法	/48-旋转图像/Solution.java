class Solution {
    public void rotate(int[][] matrix) {
        int height = matrix.length;
        if (height == 1) {
            return;
        }
        int width = height;
        for (int i = 0; i < width; i += 2) {
            int maxWidth = width - i;
            for (int j = 0; j < maxWidth - 1; j++) {
                int startHeight = i / 2; // x轴开始的坐标 1
                int endHeight = width - i / 2 - 1; // x轴结束的坐标 2
                int startWidth = startHeight; // 1
                int endWidth = endHeight; // 2
                int temp = matrix[startHeight][startWidth + j]; //
//                System.out.println("i : " + i + " , j : " + j + " , width: " + width);
//                System.out.println("startHeight: " + startHeight + " ,endHeight: " + endHeight + ", startWidth: " + startWidth + ", endWidth: " + endWidth);
                matrix[startHeight][startWidth + j] = matrix[endHeight - j][startWidth];
//                System.out.println("matrix[startHeight][j]: " + matrix[startHeight][j]);
                matrix[endHeight - j][startWidth] = matrix[endHeight][endWidth - j];
//                System.out.println("matrix[endHeight - j][startWidth]: " + matrix[endHeight - j][startWidth]);
                matrix[endHeight][endWidth - j] = matrix[startHeight + j][endWidth];
//                System.out.println("matrix[endHeight][endWidth - j]: " + matrix[endHeight][endWidth - j]);
                matrix[startHeight + j][endWidth] = temp;
//                System.out.println("matrix[startHeight + j][endWidth]: " + matrix[startHeight + j][endWidth]);
            }
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:40.6 MB,击败了17.04% 的Java用户
 */