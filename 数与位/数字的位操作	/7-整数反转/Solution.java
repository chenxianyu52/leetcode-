class Solution {
    public int reverse(int x) {
        if (x < 10 && x > -10) {
            return x;
        }
        int flag = x > 0 ? 1 : -1;
        long ll = (long) x;
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(ll * flag));
        String reverseString = sb.reverse().toString();
//        System.out.println("serverse: " + reverseString);
        long o = Long.parseLong(reverseString) * flag;
        if (o > Integer.MAX_VALUE || o < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) o;
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了41.58% 的Java用户
 * 内存消耗:39.1 MB,击败了12.15% 的Java用户
 */