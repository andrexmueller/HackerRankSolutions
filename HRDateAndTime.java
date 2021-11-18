/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import java.util.Calendar;
import java.util.Scanner;

public class HRDateAndTime {

    static class Solution {

        private final int year, day, month;
        private final String[] days = {
                "SUNDAY", "MONDAY", "TUESDAY",
                "WEDNESDAY", "THURSDAY", "FRIDAY",
                "SATURDAY"
        };

        private Solution(int y, int m, int d) {
            year = y;
            day = d;
            month = m - 1;
        }

        private String dayOfWeek() {
            Calendar calendar = Calendar.getInstance();
            calendar.set(year, month, day);
            return days[calendar.get(Calendar.DAY_OF_WEEK) - 1];
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();
        Solution sol = new Solution(year, month, day);
        System.out.println(sol.dayOfWeek());
    }
}




