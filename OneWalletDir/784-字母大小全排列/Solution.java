class Solution {
    public List<String> letterCasePermutation(String s) {
        ArrayList<String> result = new ArrayList<>();
        int len = s.length();
        process(s, result, 0, "");
        return result;
    }

    private void process(String str, ArrayList<String> result, int index, String ss) {
        if (index == str.length()) {
            result.add(ss);
            return;
        }
        if (str.charAt(index) <= '9' && str.charAt(index) >= '0') {
            process(str, result, index + 1, ss + str.charAt(index));
        }

        if (str.charAt(index) >= 'a' && str.charAt(index) <= 'z') {
            process(str, result, index + 1, ss + str.charAt(index));
            process(str, result, index + 1, ss + (char) (str.charAt(index) - 'a' + 'A'));
        }

        if (str.charAt(index) >= 'A' && str.charAt(index) <= 'Z') {
            process(str, result, index + 1, ss + str.charAt(index));
            process(str, result, index + 1, ss + (char) (str.charAt(index) - 'A' + 'a'));
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:7 ms,击败了33.46% 的Java用户
 * 内存消耗:42.6 MB,击败了5.01% 的Java用户
 */