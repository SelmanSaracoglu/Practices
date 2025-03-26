package WriteMethods;

import java.util.Scanner;

public class TimeConverter {

    public static int convertHoursToSeconds (int hours) {
        return hours*3600;
    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen donusturmek ıcın saat degeri giriniz: ");
        int hours = scanner.nextInt();
        int seconds = convertHoursToSeconds(hours);
        System.out.println(hours + " saat = " + seconds + " saniyedir.");

        scanner.close();
    }
}
