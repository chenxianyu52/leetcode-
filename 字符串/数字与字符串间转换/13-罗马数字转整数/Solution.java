class Solution {
    public int romanToInt(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);
        char[] chars = s.toCharArray();
        int len = chars.length;
        int result = 0;
        int i = 0;
        while (i < len - 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(chars[i]).append(chars[i + 1]);
            String key = sb.toString();
            if (map.containsKey(key)) {
                result += map.get(key);
                i += 2;
            } else {
                result += map.get(String.valueOf(chars[i]));
                i++;
            }
//            System.out.println("result" + result);
        }
        if (i == len - 1) {
            result += map.get(String.valueOf(chars[i]));
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:6 ms,击败了18.37% 的Java用户
 * 内存消耗:41.9 MB,击败了20.22% 的Java用户
 */