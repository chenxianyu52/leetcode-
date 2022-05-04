class Solution {
    public int findLUSlength(String[] strs) {
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        int len = strs.length;
        int result = -1;
        for (int i = 0; i < len; i++) {
            int j = 0;
            for (; j < len; j++) {
                if (i == j) {
                    continue;
                }
                if (isMatch(strs[i], strs[j])) {
//                    System.out.println("i:" + i + ", j : " + j);
                    break;
                }
            }
            if (j == strs.length) {
                result = Math.max(result, strs[i].length());
            }
        }
        return result;
    }

    // s1 是短一点的，s2是长一点的。
    private boolean isMatch(String s1, String s2) {
        int j = 0;
        int i = 0;
        while (i < s2.length() && j < s1.length()) {
            if (s2.charAt(i) == s1.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == s1.length();
    }
}
/**
 * 解答成功:
 * 执行耗时:2 ms,击败了35.85% 的Java用户
 * 内存消耗:39.1 MB,击败了31.39% 的Java用户
 */