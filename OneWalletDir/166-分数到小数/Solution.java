class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        long numeratorLong = (long) numerator;
        long denominatorLong = (long) denominator;
        if (numeratorLong % denominatorLong == 0) {
            return String.valueOf(numeratorLong / denominatorLong);
        }
        StringBuilder sb = new StringBuilder();
        // 正负
        if ((numeratorLong < 0 && denominatorLong > 0) || (numeratorLong > 0 && denominatorLong < 0)) {
            sb.append('-');
        }
        // 整数
        numeratorLong = Math.abs(numeratorLong);
        denominatorLong = Math.abs(denominatorLong);
        System.out.println("ahha" + (numeratorLong / denominatorLong));
        sb.append(numeratorLong / denominatorLong);
        sb.append('.');

        HashMap<Long, Integer> map = new HashMap<>();
        int index = 0;

        long yu = numeratorLong % denominatorLong;
        StringBuilder sbXiaoshu = new StringBuilder();
        while (yu != 0 && !map.containsKey(yu)) {
            map.put(yu, index);
            yu = yu * 10;
            sbXiaoshu.append(yu / denominatorLong);
            yu = yu % denominatorLong;
            index++;
        }

        if (yu != 0) {
            int indexNum = map.get(yu);
            sbXiaoshu.insert(indexNum, '(');
            sbXiaoshu.append(')');
        }
        sb.append(sbXiaoshu);
        return sb.toString();
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了100.00% 的Java用户
 * 内存消耗:39 MB,击败了36.71% 的Java用户
 */