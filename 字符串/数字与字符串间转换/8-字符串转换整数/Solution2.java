class Solution {
    public int myAtoi(String s) {
        /**
         *             ' '	 +/-	number	    other
         * start	  start	signed	in_number	end
         * signed	   end	 end	in_number	end
         * in_number   end	 end	in_number	end
         * end	       end	end	    end	        end
         */
        char[] chars = s.toCharArray();
        int flag = 1;
        long result = 0;
        // 0 start,1 signed,2 in_number,3 end
        int[][] status = {{0, 1, 2, 3}, {3, 3, 2, 3}, {3, 3, 2, 3}, {3, 3, 3, 3}};
        int startStatus = 0;
        for (char c : chars) {
            int nextStatus = status[startStatus][getStatusCol(c)];
            if (nextStatus == 1) {
                if (c == '-') {
                    flag = -1;
                }
            } else if (nextStatus == 0) {
                continue;
            } else if (nextStatus == 2) {
                result = result * 10 + (c - '0');
                if (flag == 1 && flag * result > (long) Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                } else if (flag == -1 && flag * result < (long) Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
            } else {
                break;
            }
            startStatus = nextStatus;
        }
        return (int) (flag * result);
    }

    private int getStatusCol(char c) {
        if (c == ' ') {
            return 0;
        }
        if (c == '+' || c == '-') {
            return 1;
        }
        if (c <= '9' && c >= '0') {
            return 2;
        }
        return 3;
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了100.00% 的Java用户
 * 内存消耗:41 MB,击败了79.91% 的Java用户
 */