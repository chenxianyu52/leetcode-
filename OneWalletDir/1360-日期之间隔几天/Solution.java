import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Solution {
    public int daysBetweenDates(String date1, String date2) {
        LocalDate startDate = LocalDate.parse(date1);


        LocalDate endDate = LocalDate.parse(date2);


        long daysDiff = ChronoUnit.DAYS.between(startDate, endDate);
        return Math.abs((int) daysDiff);
    }
}
/**
 * 解答成功:
 * 执行耗时:7 ms,击败了34.63% 的Java用户
 * 内存消耗:39.8 MB,击败了27.76% 的Java用户
 */