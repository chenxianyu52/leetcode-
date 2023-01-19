class Solution {
    public boolean strongPasswordCheckerII(String password) {
        int len = password.length();
        if (len < 8) {
            return false;
        }
        Set<Character> hashSet = new HashSet<>();
        // !@#$%^&*()-+
        hashSet.add('!');
        hashSet.add('@');
        hashSet.add('#');
        hashSet.add('$');
        hashSet.add('%');
        hashSet.add('^');
        hashSet.add('&');
        hashSet.add('*');
        hashSet.add('(');
        hashSet.add(')');
        hashSet.add('-');
        hashSet.add('+');
        char[] chars = password.toCharArray();
        boolean hasSmall = false;
        boolean hasBig = false;
        boolean hasNum = false;
        boolean hasTeshu = false;
        for (int i = 0; i < len; i++) {
            if (i > 0 && chars[i] == chars[i - 1]) {
                return false;
            }
            if (Character.isDigit(chars[i])) {
                hasNum = true;
                continue;
            }
            if (Character.isLowerCase(chars[i])) {
                hasSmall = true;
                continue;
            }
            if (Character.isUpperCase(chars[i])) {
                hasBig = true;
                continue;
            }
            if (hashSet.contains(chars[i])) {
                hasTeshu = true;
            }
        }
        return hasSmall && hasBig && hasNum && hasTeshu;


    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了69.57% 的Java用户
 * 内存消耗:39.8 MB,击败了23.91% 的Java用户
 */