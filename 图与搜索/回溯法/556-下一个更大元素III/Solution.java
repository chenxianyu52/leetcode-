class Solution {
    public int nextGreaterElement(int n) {
        if (n >= 1 && n <= 9) {
            return -1;
        }

        char[] chars = String.valueOf(n).toCharArray();
        int len = chars.length;
        int i = len - 1;
        while (i >= 0) {
            if (i < len - 1 && chars[i] < chars[i + 1]) {
                break;
            }
            i--;
        }
        if (i == -1) {
            return -1;
        }
//        System.out.println("i: " + i);
        int j = len - 1;
        while (j > i && j >= 0) {
            if (chars[j] > chars[i]) {
                break;
            }
            j--;
        }

        swap(chars, i, j);

        Arrays.sort(chars, i + 1, len);

        long l = Long.parseLong(String.valueOf(chars));
        if (l > Integer.MAX_VALUE) {
            return -1;
        } else {
            return (int) l;
        }
    }

    private void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }


    private void reverse(char[] chars) {
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            swap(chars, left, right);
            left++;
            right--;
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:38.4 MB,击败了33.33% 的Java用户
 */