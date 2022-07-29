class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber != 0) {
//            System.out.println("col: " + columnNumber);
            int val = (columnNumber - 1) % 26 + 1; // [1..26]
            char c = (char) (val + 'A' - 1);
            sb.append(c);
            columnNumber = (columnNumber - 1) / 26;
        }
        return sb.reverse().toString();
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:38.8 MB,击败了34.20% 的Java用户
 */