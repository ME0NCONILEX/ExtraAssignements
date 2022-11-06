package ExtraAssignments;
import java.util.Scanner;
// Java program to generate calendar for required month of year
public class MyCalendarM {

    public static void main(String[] a) {

        // Reading input by creating objects of Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = sc.nextInt();
        System.out.print("Enter month : ");
        int month = sc.nextInt();

        System.out.println("==================");
        System.out.println("Calendar for " + year + ",");
        System.out.println("==================");

            int d = 1;
            int m = 1;
            int y = 1;
            int dy = -1;

            // Storing data as input
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

            // Case month = 2 and Print the desired month of input year
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
                spaces = 6;

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

