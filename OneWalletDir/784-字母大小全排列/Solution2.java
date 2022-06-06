class Solution {
    public List<String> letterCasePermutation(String s) {
        ArrayList<String> result = new ArrayList<>();
        int len = s.length();
        char[] chars = new char[len];
        char[] charStr = s.toCharArray();
        process(charStr, result, 0, chars);
        return result;
    }

    private void process(char[] charStr, ArrayList<String> result, int index, char[] chars) {
        if (index == charStr.length) {
            result.add(new String(chars));
            return;
        }
        if (charStr[index] <= '9' && charStr[index] >= '0') {
            chars[index] = charStr[index];
            process(charStr, result, index + 1, chars);
        }

        if (charStr[index] >= 'a' && charStr[index] <= 'z') {
            chars[index] = charStr[index];
            process(charStr, result, index + 1, chars);
            chars[index] = (char) (charStr[index] - 'a' + 'A');
            process(charStr, result, index + 1, chars);
        }

        if (charStr[index] >= 'A' && charStr[index] <= 'Z') {
            chars[index] = charStr[index];
            process(charStr, result, index + 1, chars);
            chars[index] = (char) (charStr[index] - 'A' + 'a');
            process(charStr, result, index + 1, chars);
        }


        // 大小写转换可以用chars[index] ^= (1 << 5)
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了100.00% 的Java用户
 * 内存消耗:41.8 MB,击败了75.91% 的Java用户
 */