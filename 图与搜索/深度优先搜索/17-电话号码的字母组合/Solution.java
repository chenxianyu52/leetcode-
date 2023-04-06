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
            dfs(chars, numsIndex + 1, ss + numString[index].charAt(i));
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:6 ms,击败了16.12% 的Java用户
 * 内存消耗:41.5 MB,击败了10.71% 的Java用户
 */