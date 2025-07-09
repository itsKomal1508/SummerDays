import java.util.*;
class GetNextDate
{
public static boolean isLeapYear(int year) {
        // Leap year if divisible by 400, or divisible by 4 but not by 100
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static int getDaysInMonth(int month, int year) {
        switch(month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 0; // invalid month (should not happen as per assumption)
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day: ");
        int day = sc.nextInt();

        System.out.print("Enter month: ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        int daysInMonth = getDaysInMonth(month, year);

        // Calculate next date
        day++;
        if (day > daysInMonth) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }

        System.out.println("Next Date isc: " + day + "-" + month + "-" + year);
	}
}