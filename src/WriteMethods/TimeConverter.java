package WriteMethods;

import java.util.Scanner;

public class TimeConverter {

        public static int convertHoursToSeconds (int hours) {
            return hours*3600;
        }

        public static int convertMinutesToSeconds (int minutes){
            return minutes*60;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            while (true) {
                System.out.println("Saat mi dönüştürmek istiyorsunuz yoksa dakika mı?");
                System.out.println("[S] Saat | [D] Dakika | [Q] Çıkış");
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("q")){
                    System.out.println("Cikis yapiliyor.");
                    break;
                }
                if (input.equalsIgnoreCase("s")){
                    System.out.println("Lutfen donusturmek ıcın saat degerini giriniz: ");
                    int hours = scanner.nextInt();
                    scanner.nextLine(); // Buffer temizleme
                    int seconds = convertHoursToSeconds(hours);
                    System.out.println(hours + " saat = " + seconds + " saniyedir.");
                } else if (input.equalsIgnoreCase("D")) {
                    System.out.println("Lutfen donusturmek ıcın dakika degerini giriniz: ");
                    int minutes = scanner.nextInt();
                    scanner.nextLine(); // Buffer temizleme
                    int seconds = convertMinutesToSeconds(minutes);
                    System.out.println(minutes + " dakika = " + seconds + " saniyedir.");
                }
            }
            scanner.close();
        }
}
