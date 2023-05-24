class Solution {
    List<String> result = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        if (s.length() < 4) {
            return result;
        }

        dfs(s.toCharArray(), 0, new ArrayList<>());
        return result;
    }

    private void dfs(char[] chars, int indexString, List<String> strings) {
        if (strings.size() > 4) {
            return;
        }
        if (strings.size() > 0) {
            String topString1 = strings.get(strings.size() - 1);
            if (Integer.parseInt(topString1) > 255 || (topString1.charAt(0) == '0' && topString1.length() > 1)) {
                return;
            }
        }

        if (strings.size() < 4 && indexString >= chars.length) {
            return;
        }

        if (strings.size() == 4 && indexString == chars.length) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 4; i++) {
                sb.append(strings.get(i));
                if (i != 3) {
                    sb.append(".");
                }
            }
            result.add(sb.toString());
            return;
        }

        if (strings.size() == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(chars[indexString]);
            strings.add(sb.toString());
            dfs(chars, indexString + 1, strings);
        } else {
            // 在原来的list 顶上的string 添加 char
//            String topString = strings.get(strings.size() - 1);

            List<String> copy1 = new ArrayList<>(strings);
            String topString = copy1.get(copy1.size() - 1);
//            System.out.println("top1 : " + topString);
//            if (Integer.parseInt(topString) > 255) {
//                return;
//            }

            StringBuilder sb1 = new StringBuilder(topString);
            sb1.append(chars[indexString]);
//            System.out.println("sb : " + sb1.toString() + ", index:"+indexString);
            copy1.set(copy1.size() - 1, sb1.toString());
//            System.out.println("top : " + copy1.get(copy1.size() -1));
            dfs(chars, indexString + 1, copy1);

            List<String> copy2 = new ArrayList<>(strings);
            StringBuilder sb = new StringBuilder();
            sb.append(chars[indexString]);
            copy2.add(sb.toString());
            dfs(chars, indexString + 1, copy2);
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:2 ms,击败了77.09% 的Java用户
 * 内存消耗:42.6 MB,击败了5.00% 的Java用户
 */