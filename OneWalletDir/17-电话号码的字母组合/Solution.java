class Solution {
    private String[] digitsString = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        if ("".equals(digits)) {
            return new ArrayList<String>();
        }
        ArrayList<String> list = new ArrayList<>();
        String digitsStringChild = digitsString[digits.charAt(0) - '2'];
        int lenParent = digitsStringChild.length();
        insert(list, 0, digits, new StringBuilder());
        return list;
    }

    private void insert(List<String> resultList, int index, String digits, StringBuilder sb) {
        int len = digits.length();
        if (index == len) {
            resultList.add(sb.toString());
        } else {
            String digitsStringChild = digitsString[digits.charAt(index) - '2'];
            int lenParent = digitsStringChild.length();
            for (int i = 0; i < lenParent; i++) {
//                System.out.println("index start : " + index + ", sb:  " + sb.toString() + " , i : " + i);
                sb.append(digitsStringChild.charAt(i));
                insert(resultList, index + 1, digits, sb);
                sb.deleteCharAt(index);
//                System.out.println("index end : " + index + ", sb:  " + sb.toString() + " , i : " + i);
            }
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:40.2 MB,击败了21.45% 的Java用户
 */