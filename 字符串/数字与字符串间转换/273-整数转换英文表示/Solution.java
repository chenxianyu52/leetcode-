class Solution {
    public String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
        ArrayList<NumBer> list = new ArrayList<>();
        list.add(new NumBer(1000000000, "Billion"));
        list.add(new NumBer(1000000, "Million"));
        list.add(new NumBer(1000, "Thousand"));
        list.add(new NumBer(100, "Hundred"));
        list.add(new NumBer(90, "Ninety"));
        list.add(new NumBer(80, "Eighty"));
        list.add(new NumBer(70, "Seventy"));
        list.add(new NumBer(60, "Sixty"));
        list.add(new NumBer(50, "Fifty"));
        list.add(new NumBer(40, "Forty"));
        list.add(new NumBer(30, "Thirty"));
        list.add(new NumBer(20, "Twenty"));
        list.add(new NumBer(19, "Nineteen"));
        list.add(new NumBer(18, "Eighteen"));
        list.add(new NumBer(17, "Seventeen"));
        list.add(new NumBer(16, "Sixteen"));
        list.add(new NumBer(15, "Fifteen"));
        list.add(new NumBer(14, "Fourteen"));
        list.add(new NumBer(13, "Thirteen"));
        list.add(new NumBer(12, "Twelve"));
        list.add(new NumBer(11, "Eleven"));
        list.add(new NumBer(10, "Ten"));
        list.add(new NumBer(9, "Nine"));
        list.add(new NumBer(8, "Eight"));
        list.add(new NumBer(7, "Seven"));
        list.add(new NumBer(6, "Six"));
        list.add(new NumBer(5, "Five"));
        list.add(new NumBer(4, "Four"));
        list.add(new NumBer(3, "Three"));
        list.add(new NumBer(2, "Two"));
        list.add(new NumBer(1, "One"));

        return getString(num, list);
    }

    private String getString(int num, ArrayList<NumBer> list) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            for (int i = 0; i < list.size(); i++) {
                int sum = num / list.get(i).num;
                if (sum > 0) {
//                    System.out.println("sum: " + sum + ", i = " + i + " ,num[i]" + list.get(i).num);
//
//                    System.out.println("num: " + num);
                    if (sb.length() > 0) {
                        sb.append(" ");
                    }
                    if (i < 4) {
                        sb.append(getString(sum, list)).append(" ").append(list.get(i).englishString);
                    } else {
                        sb.append(list.get(i).englishString);
                    }
                    num = num - sum * list.get(i).num;
                    break;
                }
            }
        }
        return sb.toString();
    }

    class NumBer {
        public int num;
        public String englishString;

        public NumBer(int number, String string) {
            num = number;
            englishString = string;
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:2 ms,击败了82.04% 的Java用户
 * 内存消耗:41.4 MB,击败了16.61% 的Java用户
 */