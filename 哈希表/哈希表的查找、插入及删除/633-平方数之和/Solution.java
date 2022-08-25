class Solution {
    public boolean judgeSquareSum(int c) {
        int sum = (int) Math.sqrt(c) + 1;
//        System.out.println("sum: " + sum);
        long start = 0;
        long end = sum;
        while (start <= end) {
            long t = start * start + end * end;
//            System.out.println("t: " +t );
            if (t == (long) c) {
                return true;
            }
            if (t > (long) c) {
                end--;
            } else {
                start++;
            }
        }
        return false;
    }
}
/**
 * 解答成功:
 * 执行耗时:3 ms,击败了92.30% 的Java用户
 * 内存消耗:38.2 MB,击败了70.14% 的Java用户
 */