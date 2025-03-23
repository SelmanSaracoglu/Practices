package FirstWeek;

import java.util.Scanner;

public class leapYear {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true){

            System.out.println("Kontrol etmek istediginiz yil'i giriniz: ");
            int yil = scanner.nextInt();

            // Kullanıcı çıkmak isterse döngüyü kır
            if (yil < 0) {
                System.out.println("Programdan cikiliyor: ");
                break;
            }

            boolean bl= false;

            if (yil % 4 == 0 && yil % 100 != 0 || (yil % 400 == 0)) {
                bl = true;
            }

            if (bl) {
                System.out.println("Girilen " + yil + " bir artık yıldır.");
            }else {
                System.out.println("Girilen " + yil + " bir artık yıl değildir.");
            }
        }

        scanner.close();

    }
}
