class Solution {
    String[] numString = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    List<String> result = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        char[] chars = digits.toCharArray();
        if (chars.length == 0) {
            return result;
        }
        dfs(chars, 0, "");
        return result;
    }

    private void dfs(char[] chars, int numsIndex, String ss) {
        if (numsIndex >= chars.length) {
            result.add(ss);
            return;
        }
        int index = chars[numsIndex] - '0';
//        System.out.println("index : " + index);
        for (int i = 0; i < numString[index].length(); i++) {
            StringBuilder sb = new StringBuilder(ss);
            sb.append(numString[index].charAt(i));
            dfs(chars, numsIndex + 1, sb.toString());
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:40.3 MB,击败了28.72% 的Java用户
 */