class Solution {
    public String intToRoman(int num) {
        int[] nums = new int[]{1000, 500, 100, 50, 10, 5, 1};
        char[] chars = new char[]{'M', 'D', 'C', 'L', 'X', 'V', 'I'};
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            int i = 0;
            for (; i < nums.length; i++) {
                if (num / nums[i] > 0) {
                    break;
                }
            }
            int firstNum = String.valueOf(num).charAt(0) - '0';
//            System.out.println("firstNum: " + firstNum);
//            System.out.println("nums[i]: " + nums[i]);

            if (firstNum == 9) {
                sb.append(chars[i+1]);
                sb.append(chars[i-1]);
                num = num % (nums[i-1] - nums[i+1]);
            } else if (firstNum == 4) {
                sb.append(chars[i]);
                sb.append(chars[i-1]);
                num = num % (nums[i-1] - nums[i]);
            } else {
                int numSize = num / nums[i];
                for (int j = 0; j < numSize; j++) {
                    sb.append(chars[i]);
                }
                num = num % nums[i];
            }
        }
        return sb.toString();

    }
}