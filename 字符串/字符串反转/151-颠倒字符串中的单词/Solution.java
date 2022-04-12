class Solution {
    public String reverseWords(String s) {
        LinkedList<String> list = new LinkedList<String>();
        int len = s.length();
        int start = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ') {
                if (sb.length() > 0) {
                    if (list.size() > 0) {
                        list.addFirst(sb.append(' ').toString());
                    } else {
                        list.add(sb.toString());
                    }
                    sb = new StringBuilder();
                }
            } else {
                sb.append(s.charAt(i));
            }
        }
        if (sb.length() > 0) {
            if (list.size() > 0) {
                list.addFirst(sb.append(' ').toString());
            } else {
                list.add(sb.toString());
            }
        }
        StringBuilder result = new StringBuilder();
        for (String string : list) {
            result.append(string);
        }
        return result.toString();
    }
}
/**
 * 解答成功:
 * 执行耗时:5 ms,击败了70.21% 的Java用户
 * 内存消耗:41.1 MB,击败了52.48% 的Java用户
 */