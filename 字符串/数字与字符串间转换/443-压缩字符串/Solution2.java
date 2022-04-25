class Solution {
    public int compress(char[] chars) {
        int len = chars.length;
        if (len <= 1) {
            return len;
        }
        int j = 1;
        char pre = chars[0];
        int count = 1;
        for (int i = 1; i < len; i++) {
            if (chars[i] == pre) {
                count++;
            } else {
                if (count == 1) {
                    chars[j] = chars[i];
                    j++;
                } else {
                    int start = j;
                    while (count > 0) {
                        chars[j] = (char) ('0' + count % 10);
                        count = count / 10;
                        j++;
                    }
                    reverse(chars, start, j - 1);
                    chars[j] = chars[i];
                    j++;
                }
                pre = chars[i];
                count = 1;
            }
//            System.out.println("i: " + i + "chars[i]" + chars[i] + "count " + count + " pre : " + pre);
        }
//        System.out.println(count);
        if (count > 1) {
            String countString = String.valueOf(count);
            char[] charsCount = countString.toCharArray();
            for (char c : charsCount) {
                chars[j] = c;
                j++;
            }
        }
        return j;
    }

    private void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:40.8 MB,击败了62.34% 的Java用户
 */