class Solution {
    public boolean isUgly(int n) {
//        if(n <= 1 && n >= -1){
//            return false;
//        }
        if (n <= 0) {
            return false;
        }
        while (n != 0) {
//            System.out.println("n : " + n);
            if (n == 1) {
                break;
            }
            if (n % 2 == 0) {
                n /= 2;
                continue;
            }
            if (n % 3 == 0) {
                n /= 3;
                continue;
            }
            if (n % 5 == 0) {
                n /= 5;
                continue;
            }
            return false;
        }

        return true;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:38.7 MB,击败了51.44% 的Java用户
 */