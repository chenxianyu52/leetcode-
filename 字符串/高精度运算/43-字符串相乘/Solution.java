class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        String maxString = num1.length() >= num2.length() ? num1 : num2;
        String minString = num1.length() >= num2.length() ? num2 : num1;
//        System.out.println("maxString : " + maxString + " , minString : " + minString);
        int minLen = minString.length();
        int maxLen = maxString.length();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = minLen - 1; i >= 0; i--) {
            int a = minString.charAt(i) - '0';
            int indexI = minLen - 1 - i;
            int jinwei = 0;
//            System.out.println("indexI : " + indexI + " , min a : " + a);
            for (int j = maxLen - 1; j >= 0; j--) {
                int b = maxString.charAt(j) - '0';
                int indexJ = maxLen - 1 - j;
                int index = indexI + indexJ;

                int cheng;
                if (index < list.size()) {
                    cheng = a * b + jinwei + list.get(index);
                    list.set(index, cheng % 10);
//                    System.out.println("indexJ : " + indexJ + " , max b : " + b + " , jinwei:" + jinwei + ",cheng: " + cheng + ",list(i): " + list.get(index));
                } else {
                    cheng = a * b + jinwei;
                    list.add(cheng % 10);
//                    System.out.println("indexJ : " + indexJ + " , max b : " + b + " , jinwei:" + jinwei+ ",cheng: " + cheng);
                }
                jinwei = cheng / 10;
            }
            if (jinwei > 0) {
                list.add(jinwei);
            }
        }
        StringBuilder sb = new StringBuilder();

        for (int k = list.size() - 1; k >= 0; k--) {
            sb.append(list.get(k));
        }
        return sb.toString();
    }
}
/**
 * 解答成功:
 * 执行耗时:3 ms,击败了67.19% 的Java用户
 * 内存消耗:41.5 MB,击败了43.69% 的Java用户
 */