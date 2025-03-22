package FirstWeek;

import java.util.Scanner;

public class ChangeToUpperCase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String cevir;

        while (true) {
            System.out.println("Ana Sayfa");
            System.out.println("1. Buyuk harfe donustur.");
            System.out.println("2. Kucuk harfe donustur.");
            System.out.println("3. Cikis yap.");

            String secim = scanner.nextLine();

            switch (secim) {
                case "1":
                    System.out.println("Lutfen buyuk harfe cevirmek istediginiz Strin'i giriniz: ");
                    cevir = scanner.nextLine();
                    System.out.println("Buyuk harf hali: " + cevir.toUpperCase());
                    break; // break sadece switch bloğunun içindeki akışı durdurur.
                case "2":
                    System.out.println("Lutfen kucuk harfe cevirmek istediginiz Strin'i giriniz: ");
                    cevir = scanner.nextLine();
                    System.out.println("Kucuk harf hali: " + cevir.toLowerCase());
                    break;
                case "3":
                    System.out.println("Program is ending.");
                    scanner.close();
                    return; // return kullanıyoruz çünkü bu satır, while döngüsünü ve programı sonlandırır
                default:
                    System.out.println("Geçersiz seçim, lütfen 1, 2 veya 3 giriniz.");
                    break;
            }

        }

    }
}
