import java.util.Scanner;

public class TimeAngle {
    public static void main(String[] args) {
        System.out.println("Enter the hour number");
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        System.out.println("Enter the minute number");
        int min = scanner.nextInt();
        System.out.println("The angle between minute and hour hands is:");
        System.out.println(calculateAngle(hour, min));
    }

    private static float calculateAngle(int hour, int minute) {
        if (hour > 12)
            hour = hour - 12;
        float hourangle = 0;
        int minuteangle = 0;
        if (hour != 0 && hour != 12)
            hourangle = (hour * 30);
        if (minute != 0 && minute != 60) {
            hourangle = hourangle + ((float)(minute * 360) / (12 * 60));
            minuteangle = minute * 6;
        }
        return Math.abs(minuteangle - hourangle);
    }
}
