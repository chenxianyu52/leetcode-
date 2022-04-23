class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        String[] nums1String = num1.split("\\+");
        String[] nums2String = num2.split("\\+");
        int nums1Shi = Integer.parseInt(nums1String[0]);
        int nums1Xu = Integer.parseInt(nums1String[1].replace("i", ""));
        int nums2Shi = Integer.parseInt(nums2String[0]);
        int nums2Xu = Integer.parseInt(nums2String[1].replace("i", ""));
        int shi = nums1Shi * nums2Shi - nums1Xu * nums2Xu;
        int xu = nums1Shi * nums2Xu + nums2Shi * nums1Xu;
        StringBuilder sb = new StringBuilder();
        return sb.append(shi).append("+").append(xu).append("i").toString();
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了94.07% 的Java用户
 * 内存消耗:39.4 MB,击败了74.10% 的Java用户
 */