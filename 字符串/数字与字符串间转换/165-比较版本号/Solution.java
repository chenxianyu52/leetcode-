class Solution {
    public int compareVersion(String version1, String version2) {

        char[] charsVersion1 = version1.toCharArray();
        char[] charsVersion2 = version2.toCharArray();
        int versionLength1 = charsVersion1.length;
        int versionLength2 = charsVersion2.length;
        int i = 0;
        int j = 0;
        int num1 = 0;
        int num2 = 0;
        while (i < versionLength1 || j < versionLength2) {
            num1 = 0;
            num2 = 0;
            if (i < versionLength1) {
                while (i < versionLength1 && charsVersion1[i] != '.') {
                    num1 = num1 * 10 + (charsVersion1[i] - '0');
                    i++;
                }
            }

            if (j < versionLength2) {
                while (j < versionLength2 && charsVersion2[j] != '.') {
                    num2 = num2 * 10 + (charsVersion2[j] - '0');
                    j++;
                }
            }
            i++;
            j++;

            if (num1 > num2) {
                return 1;
            } else if (num1 < num2) {
                return -1;
            }
        }
        return 0;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:39.4 MB,击败了46.50% 的Java用户
 */