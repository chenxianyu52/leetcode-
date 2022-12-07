class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        boolean[] status = new boolean[256];
        status['a'] = true;
        status['e'] = true;
        status['i'] = true;
        status['o'] = true;
        status['u'] = true;
        status['A'] = true;
        status['E'] = true;
        status['I'] = true;
        status['O'] = true;
        status['U'] = true;
        int left = 0;
        int right = len - 1;
        while (left < right) {
            while (left < len && !status[chars[left]]) {
                left++;
            }
            while (right >= 0 && !status[chars[right]]) {
                right--;
            }
//            System.out.println("left: " + left + ", right : " + right);
            if (left != right && left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
            }
            left++;
            right--;
        }
        return String.valueOf(chars);
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了100.00% 的Java用户
 * 内存消耗:41.8 MB,击败了32.56% 的Java用户
 */