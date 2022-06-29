class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        int len = words.length;
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < len) {
            int startIndex = i;
            int maxTempWidth = words[startIndex].length();
//            System.out.println("startIndex :"  + startIndex);
            while ((maxTempWidth <= maxWidth) && (i + 1 < len)) {
                maxTempWidth += (1 + words[i + 1].length());
                i++;
//                System.out.println("i :"  + i);
            }
//            System.out.println("aaa startIndex : " + startIndex +",endIndex: " + (i - 1));
            StringBuilder sb = new StringBuilder();
            if (maxTempWidth > maxWidth) {
                maxTempWidth = maxTempWidth - words[i].length() - 1;
                i--;

                int blankSize = maxWidth - maxTempWidth + (i - startIndex);

                int pingfen = 0;
                int yu = 0;
                if ((i - startIndex) > 0) {
                    pingfen = blankSize / (i - startIndex);
                    yu = blankSize % (i - startIndex);
                }
                sb.append(words[startIndex]);
                // i 就是endIndex
                if ((i - startIndex) > 0) {
                    for (int k = startIndex + 1; k <= i; k++) {
                        if (k <= startIndex + yu) {
                            for (int a = 0; a < pingfen + 1; a++) {
                                sb.append(" ");
                            }
                        } else {
                            for (int a = 0; a < pingfen; a++) {
                                sb.append(" ");
                            }
                        }
                        sb.append(words[k]);
                    }
                } else {
                    int lenTemp = maxWidth - sb.length();
                    for (int k = 0; k < lenTemp; k++) {
                        sb.append(" ");
                    }
                }

//                System.out.println("bbb i: " + i);
            } else {
                sb.append(words[startIndex]);
                for (int k = startIndex + 1; k <= i; k++) {
                    sb.append(" ");
                    sb.append(words[k]);
                }
                int lenTemp = maxWidth - sb.length();
                for (int k = 0; k < lenTemp; k++) {
                    sb.append(" ");
                }
//                System.out.println("ccc");
            }
            i++;
            result.add(sb.toString());
        }
        return result;

    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:39.9 MB,击败了23.03% 的Java用户
 */