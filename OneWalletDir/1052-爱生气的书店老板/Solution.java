class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int len = customers.length;
        int left = 0;
        int right = -1;  // [left,right] 为窗口
        int sum = 0;
        int sumHasGrumpy = 0;
        int maxSum = 0;
        int maxLeft = left;
        int maxRight = right;
        int result = 0;
        int maxIncrean = 0;
        while (left < len) {
            if (right + 1 < len && right - left + 1 < minutes) {
                right++;
                sum += customers[right];
                if (grumpy[right] == 0) {
                    sumHasGrumpy += customers[right];
                }
            } else {
                sum -= customers[left];
                if (grumpy[left] == 0) {
                    sumHasGrumpy -= customers[left];
                }
                left++;
            }
//            System.out.println("left: " + left + " , right : " + right + " , sum: " + sum + " , sumHasGrumpy : " + sumHasGrumpy + " ,maxIncrean : " + maxIncrean);
            if (sum != sumHasGrumpy) {
                if (sum - sumHasGrumpy >= maxIncrean && right - left >= maxRight - maxLeft) {
                    maxIncrean = sum - sumHasGrumpy;
                    maxSum = sum;
                    maxRight = right;
                    maxLeft = left;
                }
            }
//            System.out.println("maxSum: " + maxSum + " , maxRight : " + maxRight + " , maxLeft: " + maxLeft);
        }

//        System.out.println("len : " + len+ " , maxRight : " + maxRight + " , maxLeft: " + maxLeft);

        for (int i = 0; i < len; i++) {
            if ((i < maxLeft || i > maxRight) && grumpy[i] == 0) {
                result += customers[i];
            }
        }
        return result + maxSum;

    }
}
/**
 * 解答成功:
 * 执行耗时:4 ms,击败了21.60% 的Java用户
 * 内存消耗:44.7 MB,击败了5.17% 的Java用户
 */