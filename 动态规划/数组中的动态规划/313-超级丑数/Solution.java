class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        long[] dp = new long[n + 1];
        int[] indexs = new int[primes.length];
        dp[1] = 1;

        Arrays.fill(indexs, 1);

        for (int i = 2; i <= n; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            long min = Long.MAX_VALUE;
            for (int j = 0; j < indexs.length; j++) {
                long minTemp = dp[indexs[j]] * primes[j];
                if (minTemp < min) {
                    list.clear();
                    min = minTemp;
                    list.add(j);
                } else if (minTemp == min) {
                    list.add(j);
                }
            }
//            System.out.println("min: " + min + ", prime: " + primes[index] + ", index: " + indexs[index]);
            dp[i] = min;
            for (int index : list) {
                indexs[index]++;
            }
        }
        return (int) dp[n];
    }
}
/**
 * 解答成功:
 * 执行耗时:60 ms,击败了65.16% 的Java用户
 * 内存消耗:43.8 MB,击败了35.98% 的Java用户
 */