class Solution {
    public String fractionAddition(String expression) {
        char[] chars = expression.toCharArray();
        int len = chars.length;
        long preFenzi = 0;
        long preFenMu = 1;
        char preStatus = '+';
        long currentFenzi = 0;
        long currentFenMu = 0;
        char currentStatus = '+';
        for (int i = 0; i < len; ) {
            if (chars[i] == '-' || chars[i] == '+') {
                currentStatus = chars[i];
                i++;
                currentFenzi = 0;
                currentFenMu = 0;
            }
            if (i == 0 && chars[i] <= '9' && chars[i] >= '0') {
                currentStatus = '+';
                currentFenzi = 0;
                currentFenMu = 0;
            }
            while (chars[i] != '/') {
                currentFenzi = currentFenzi * 10 + (chars[i] - '0');
                i++;
            }
            i++;
            while (i < len && (chars[i] != '+' && chars[i] != '-')) {
                currentFenMu = currentFenMu * 10 + (chars[i] - '0');
                i++;
            }
            System.out.println(preStatus + " " + preFenzi + "/" + preFenMu);
            System.out.println(currentStatus + " " + currentFenzi + "/" + currentFenMu);
            long fenzi1 = preStatus == '-' ? (preFenzi * -1) : preFenzi;
            long fenzi2 = currentStatus == '-' ? (currentFenzi * -1) : currentFenzi;
            preFenzi = fenzi1 * currentFenMu + fenzi2 * preFenMu;
            preFenMu = currentFenMu * preFenMu;
            long nums1 = preFenMu;
            long nums2 = preFenzi < 0 ? (preFenzi * -1) : preFenzi;
            while (nums2 != 0) {
                long r = nums1 % nums2;
                nums1 = nums2;
                nums2 = r;
            }
            preFenzi = preFenzi / nums1;
            preFenMu = preFenMu / nums1;
            if (preFenzi < 0) {
                preFenzi = -1 * preFenzi;
                preStatus = '-';
            } else {
                preStatus = '+';
            }
        }
        StringBuilder sb = new StringBuilder();
        if (preStatus == '-') {
            sb.append(preStatus);
        }
        return sb.append((int) preFenzi).append('/').append((int) preFenMu).toString();
    }
}
/**
 * 解答成功:
 * 执行耗时:12 ms,击败了9.23% 的Java用户
 * 内存消耗:40.1 MB,击败了32.82% 的Java用户
 */