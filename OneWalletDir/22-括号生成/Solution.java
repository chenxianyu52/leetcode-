class Solution {
    ArrayList<String> result = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        generate(new StringBuilder(), n, n);
        return result;

    }

    private void generate(StringBuilder sb, int left, int right) {
        if (left == 0 && right == 0) {
            result.add(sb.toString());
            return;
        }
        if (left == right) {
            generate(sb.append('('), left - 1, right);
            sb.deleteCharAt(sb.length() - 1);
        } else if (left < right) {
            if (left > 0) {
                generate(sb.append('('), left - 1, right);
                sb.deleteCharAt(sb.length() - 1);
            }
            generate(sb.append(')'), left, right - 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:41.5 MB,击败了36.53% 的Java用户
 */