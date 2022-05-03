class Solution {
    public int magicalString(int n) {
        int[] numStatus = new int[n + 3];
        numStatus[1] = 1;
        int k = 2; // 数量 的下标
        int i = 1;
        int currentNum = 2;

        while (i < n + 1) {
            int sum;
            if (i == 1) {
                sum = 2;
            } else {
                sum = numStatus[k];
            }

            for (int j = 1; j <= sum; j++) {
                numStatus[i + j] = currentNum;
//                System.out.println("numStatus [" + (i+j) + "] = " + numStatus[i + j]);
            }
            if (currentNum == 2) {
                currentNum = 1;
            } else {
                currentNum = 2;
            }
            k++;
            i = i + sum;
        }
        int result1Sum = 0;
        for (int j = 1; j <= n; j++) {
            if (numStatus[j] == 1) {
                result1Sum++;
            }
        }
        return result1Sum;
    }
}
/**
 * 解答成功:
 * 执行耗时:3 ms,击败了99.28% 的Java用户
 * 内存消耗:40.2 MB,击败了81.72% 的Java用户
 */