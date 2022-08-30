class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            if (set.contains(n)) {
                return false;
            }
            set.add(n);
            int result = 0;
            while (n != 0) {
                result += (n % 10) * (n % 10);
                n = n / 10;
            }
//            System.out.println("result: " + result);
            n = result;
        }
        return true;
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了79.42% 的Java用户
 * 内存消耗:38.6 MB,击败了71.26% 的Java用户
 */