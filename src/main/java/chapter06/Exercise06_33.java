package Chapter6;
public class Ex6_33 {

    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        displayDateTime(currentTimeMillis);
    }

    public static void displayDateTime(long millis) {
        final long SECONDS_IN_MINUTE = 60;
        final long MINUTES_IN_HOUR = 60;
        final long HOURS_IN_DAY = 24;
        final long DAYS_IN_YEAR = 365;

        // Calculate total seconds
        long totalSeconds = millis / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        long totalDays = totalHours / 24;
        long currentYear = 1970;
        long daysInCurrentYear = DAYS_IN_YEAR;

        while (totalDays >= daysInCurrentYear) {
            totalDays -= daysInCurrentYear;
            currentYear++;
            daysInCurrentYear = isLeapYear(currentYear) ? 366 : 365;
        }

        int[] daysInMonth = {31, isLeapYear(currentYear) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int currentMonth = 0;

        while (totalDays >= daysInMonth[currentMonth]) {
            totalDays -= daysInMonth[currentMonth];
            currentMonth++;
        }
        int currentDay = (int) totalDays + 1;

        System.out.printf("%04d-%02d-%02d %02d:%02d:%02d\n", currentYear, currentMonth + 1, currentDay, currentHour, currentMinute, currentSecond);
    }

    public static boolean isLeapYear(long year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
