class Solution {
    public int compareVersion(String version1, String version2) {
        String[] ver1String = version1.split("\\.");
        String[] ver2String = version2.split("\\.");
        System.out.println(ver1String.length);
        System.out.println(ver2String.length);
        int i = 0;
        int j = 0;
        for (; i < ver1String.length && j < ver2String.length; i++, j++) {
//            System.out.println("Integer.parseInt(ver1String[i]): " + Integer.parseInt(ver1String[i]) + " , Integer.parseInt(ver2String[j]) : "  +Integer.parseInt(ver2String[j]));
            if (Integer.parseInt(ver1String[i]) > Integer.parseInt(ver2String[j])) {
                return 1;
            } else if (Integer.parseInt(ver1String[i]) < Integer.parseInt(ver2String[j])) {
                return -1;
            }
        }Ï
        if (i == ver1String.length && j == ver2String.length) {
            return 0;
        } else {
            for (; i < ver1String.length; i++) {
                if (Integer.parseInt(ver1String[i]) > 0) {
                    return 1;
                }
            }
            for (; j < ver2String.length; j++) {
                if (Integer.parseInt(ver2String[j]) > 0) {
                    return -1;
                }
            }
        }
        return 0;
    }
}
/**
 * 解答成功:
 * 执行耗时:2 ms,击败了65.37% 的Java用户
 * 内存消耗:39.3 MB,击败了63.80% 的Java用户
 */