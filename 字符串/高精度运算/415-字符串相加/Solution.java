class Solution {
    public String addStrings(String num1, String num2) {
        int num1Len = num1.length();
        int num2Len = num2.length();
        int i = 0;
        StringBuilder sb = new StringBuilder();
        boolean isJinWei = false;
        while (i < num1Len && i < num2Len) {
            int a = num1.charAt(num1Len - 1 - i) - '0';
            int b = num2.charAt(num2Len - 1 - i) - '0';
            int sum = a + b + (isJinWei ? 1 : 0);
            if (sum >= 10) {
                isJinWei = true;
                sb.append(sum % 10);
            } else {
                isJinWei = false;
                sb.append(sum);
            }
            i++;
        }

        while (i < num1Len) {
            int a = num1.charAt(num1Len - 1 - i) - '0' + (isJinWei ? 1 : 0);
            if (a >= 10) {
                isJinWei = true;
                sb.append(a % 10);
            } else {
                isJinWei = false;
                sb.append(a);
            }
            i++;
        }

        while (i < num2Len) {
            int b = num2.charAt(num2Len - 1 - i) - '0' + (isJinWei ? 1 : 0);
            if (b >= 10) {
                isJinWei = true;
                sb.append(b % 10);
            } else {
                isJinWei = false;
                sb.append(b);
            }
            i++;
        }
        if (isJinWei) {
            sb.append(1);
        }
        return sb.reverse().toString();

    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了100.00% 的Java用户
 * 内存消耗:41.4 MB,击败了46.50% 的Java用户
 */