package DesignWithCodes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarpanlariYazdir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Carpanlarini ogrenmek istediginiz sayiyi giriniz: ");
        int sayi = scanner.nextInt();

        // Çarpanları tutacak liste
        List<Integer> carpanlarListesi = new ArrayList<>();

        for (int i = 1 ; i <= sayi ; i++) {
            if (sayi %i == 0) {
                carpanlarListesi.add(i);
            }
        }
        System.out.println("Carpanlar: " + carpanlarListesi);
        scanner.close();
    }

}
