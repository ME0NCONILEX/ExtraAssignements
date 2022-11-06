package ExtraAssignments;
// Java Program to generate calendar for current year
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyYearCalendar {
    // Main driver method
    public static void main(String[] a) {
        // Current year
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy");
        String formattedDate = myDateObj.format(myFormatObj);
        int year = Integer.parseInt(formattedDate);
        System.out.println("=================");
        System.out.println("Calendar for " + year);
        System.out.println("=================");
        // Or Choose another year
//        int year = 2018; //variant

        for (int month = 1; month <= 12; month++) {

            int d = 1;
            int m = 1;
            int y = 1;
            int dy = -1;

            // Storing data and months as input
            String[] day = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
            String[] months
                    = {"January", "February", "March", "April", "May", "June",
                    "July", "August", "September", "October", "November", "December"};

            //  Array as input
            int[] ar = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            // Till condition holds true
            while (d != 1 || m != month || y != year) {

                if (y % 4 == 0 || y % 100 == 0) {
                    ar[1] = 29;
                } else {
                    ar[1] = 28;
                }
                dy++;
                d++;

                if (d > ar[m - 1]) {
                    m++;
                    d = 1;
                }

                if (m > 12) {
                    m = 1;
                    y++;
                }

                if (dy == 7) {
                    dy = 0;
                }
            }

            if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
                ar[1] = 29;
            } else {
                ar[1] = 28;
            }

            //case month = new month
            // Print the desired year's 12 month
            System.out.println(months[month - 1]);

            for (int k = 0; k < 7; k++) {
                System.out.print("   " + day[k]);
            }
            System.out.println();

            for (int j = 1; j < (ar[month - 1] + dy); j++) {
                if (j > 6) {
                    dy = dy % 6;
                }
            }

            int spaces = dy;
            if (spaces < 0)
                spaces = 8;

            // Printing the calendar
            for (int i = 0; i < spaces; i++)
                System.out.print("      ");
            for (int i = 1; i <= ar[month - 1]; i++) {
                System.out.printf(" %4d ", i);

                if (((i + spaces) % 7 == 0)
                        || (i == ar[month - 1]))
                    System.out.println();
            }
        }
    }
}
