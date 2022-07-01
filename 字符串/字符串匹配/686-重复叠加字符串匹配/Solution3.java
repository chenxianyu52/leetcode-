class Solution {
    public int repeatedStringMatch(String a, String b) {
        boolean[] status = new boolean[26];
        char[] charsA = a.toCharArray();
        for (char charA : charsA) {
            status[charA - 'a'] = true;
        }
        char[] charsB = b.toCharArray();
        for (char charB : charsB) {
            if (!status[charB - 'a']) {
                return -1;
            }
        }

        int count = charsB.length / charsA.length;
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (; i <= count; i++) {
            sb.append(a);
        }
//        System.out.println("sb: " + sb.toString());
        for (int j = 0; j < 3; j++) {
            if (sb.toString().contains(b)) {
                return count + j;
            }
            sb.append(a);
        }
        return -1;

    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了100.00% 的Java用户
 * 内存消耗:41.1 MB,击败了57.65% 的Java用户
 */