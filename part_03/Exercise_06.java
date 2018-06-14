package part_03;



import java.util.Scanner;

class Exercise_06 {

    // the goal of this method is to print out the local time in any given timezone
    public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT (ie, -8 or 8): ");
        long timeZoneChange = input.nextInt();

        // Get total milliseconds since midnight, 1/1/1970
        long totalMilliseconds = System.currentTimeMillis();

        // Get total seconds since midnight, 1/1/1970
        long totalSeconds = totalMilliseconds/1000;

        // Get the current second within the minute within the hour
        long currentSecond = totalSeconds % 60;

        // Get total minutes
        long totalMinutes = totalSeconds/60;

        // Get the current minute in the hour
        long currentMinutes = totalMinutes % 60;

        // Get the total hours
        long totalHour = totalMinutes/60;

        // Get the current hour
        long currentHour = totalHour % 24;

        long time = currentHour + timeZoneChange;
        System.out.println(time);

        if (time >= 12) {
            System.out.println("It is currently " + (time - 12) + " : " + currentMinutes + " : " + currentSecond + " pm.");
        }
        if (time <= 11) {
            System.out.println("It is currently " +time+ " : " +currentMinutes+ " : " +currentSecond+ " am.");
        }
    }
}
