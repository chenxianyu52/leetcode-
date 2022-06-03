class Solution {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();

        boolean isFu = (num < 0);

        num = Math.abs(num);
        while (num > 0) {
            sb.append(num % 7);
            num = num / 7;
        }
        if (isFu) {
            sb.append("-");
        }
        return sb.reverse().toString();
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了77.41% 的Java用户
 * 内存消耗:38.7 MB,击败了64.25% 的Java用户
 */