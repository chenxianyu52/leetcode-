class Solution {
    public String solveEquation(String equation) {
        char[] chars = equation.toCharArray();
        int len = chars.length;
        int xLeftNums = 0;
        int normalLeftNums = 0;
        int xRightNum = 0;
        int normalRightNums = 0;
        for (int i = 0; i < len; ) {
            int isNumZheng = 1;
            while (chars[i] != '=') {
                if (chars[i] == 'x') {
                    if (i == 0) {
                        xLeftNums++;
                    }
                    i++;
                    continue;
                }
                if (chars[i] == '-') {
                    isNumZheng = -1;
                    i++;
                } else if (chars[i] == '+') {
                    isNumZheng = 1;
                    i++;
                } else if (i == 0 && chars[i] != '+') {
                    isNumZheng = 1;
                }
                int currentNum = 0;
                while (chars[i] != '+' && chars[i] != '-' && chars[i] != 'x' && chars[i] != '=') {
                    currentNum = currentNum * 10 + (chars[i] - '0');
                    i++;
                }
                if (chars[i] == 'x') {
                    System.out.println("left currentNum " + isNumZheng + " x= " + currentNum);
                    if (i > 0 && (chars[i - 1] == '+' || chars[i - 1] == '-')) {
                        xLeftNums += (isNumZheng * 1);
                    } else {
                        xLeftNums += (isNumZheng * currentNum);
                    }
                } else {
                    normalLeftNums += (isNumZheng * currentNum);
                }
            }
            i++;
            int equalTemp = i;
            isNumZheng = 1;
            while (i < len) {
                if (chars[i] == 'x') {
                    if (i == equalTemp) {
                        xRightNum++;
                    }
                    i++;
                    continue;
                }
                if (chars[i] == '-') {
                    isNumZheng = -1;
                    i++;
                } else if (chars[i] == '+') {
                    isNumZheng = 1;
                    i++;
                } else if (i == 0 && chars[i] != '+') {
                    isNumZheng = 1;
                }
                int currentNum = 0;
                while (i < len && chars[i] != '+' && chars[i] != '-' && chars[i] != 'x') {
                    currentNum = currentNum * 10 + (chars[i] - '0');
                    i++;
                }
                if (i >= len) {
                    normalRightNums += (isNumZheng * currentNum);
                    break;
                }
                if (chars[i] == '+' || chars[i] == '-') {
                    normalRightNums += (isNumZheng * currentNum);
                } else if (chars[i] == 'x') {
                    if (equalTemp > 0 && (chars[i - 1] == '+' || chars[i - 1] == '-')) {
                        xRightNum += (isNumZheng * 1);
                    } else {
                        xRightNum += (isNumZheng * currentNum);
                    }

                }
            }
        }
        System.out.println("left x= " + xLeftNums + " , left normalNum = " + normalLeftNums + " , right x = " + xRightNum + ", right nromalNum = " + normalRightNums);
        if (xLeftNums == xRightNum) {
            if (normalLeftNums == normalRightNums) {
                return "Infinite solutions";
            } else {
                return "No solution";
            }
        } else {
            if (xRightNum - xLeftNums == 0) {
                return "Infinite solutions";
            }
            StringBuilder sb = new StringBuilder();
            int value = (normalLeftNums - normalRightNums) / (xRightNum - xLeftNums);
            return sb.append("x=").append(value).toString();
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:11 ms,击败了5.31% 的Java用户
 * 内存消耗:40.1 MB,击败了7.75% 的Java用户
 */