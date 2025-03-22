package FirstWeek;

import java.util.Scanner;

public class PrintRequestedCharacter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir string giriniz: ");
        String input = scanner.nextLine();

        System.out.println("Gormek istediğiniz index'i giriniz: ");
        int index = scanner.nextInt();

        if (index >= 0 && index <= input.length()) {
            System.out.println("Istenen karakter: " + input.charAt(index));
        } else {
            System.out.println("Hatalı indeks! Geçerli bir değer giriniz (0 - " + (input.length() - 1) + " arasında).");
        }

        int karakterSayisi = input.length();
        System.out.println("Girdinin karakter sayisi: " + karakterSayisi);

        System.out.println("Cumlenin ilk ve son harfi: " + input.charAt(0) + input.charAt(input.length()-1));

        scanner.close();






    }
}
