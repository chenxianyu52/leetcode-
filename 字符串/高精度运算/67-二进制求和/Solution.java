class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        boolean isJinwei = false;
        while (i >= 0 || j >= 0) {
            if (i >= 0 && j >= 0) {
                int aNumber = a.charAt(i) - '0';
                int bNumber = b.charAt(j) - '0';
                int sum = aNumber + bNumber;
                if (isJinwei) {
                    sum++;
                }
                if (sum >= 2) {
                    sb.insert(0, sum - 2);
                    isJinwei = true;
                } else {
                    sb.insert(0, sum);
                    isJinwei = false;
                }
                i--;
                j--;
            } else if (i >= 0) {
                int aNumber = a.charAt(i) - '0';
                if (isJinwei) {
                    if (aNumber + 1 == 2) {
                        sb.insert(0, 0);
                        isJinwei = true;
                    } else {
                        sb.insert(0, aNumber + 1);
                        isJinwei = false;
                    }
                } else {
                    sb.insert(0, aNumber);
                }
                i--;
            } else {
                int bNumber = b.charAt(j) - '0';
                if (isJinwei) {
                    if (bNumber + 1 == 2) {
                        sb.insert(0, 0);
                        isJinwei = true;
                    } else {
                        sb.insert(0, bNumber + 1);
                        isJinwei = false;
                    }
                } else {
                    sb.insert(0, bNumber);
                }
                j--;
            }

        }
        if (isJinwei) {
            sb.insert(0, 1);
        }
        return sb.toString();
    }
}
/**
 * 解答成功:
 * 执行耗时:2 ms,击败了28.59% 的Java用户
 * 内存消耗:41.2 MB,击败了24.67% 的Java用户
 */