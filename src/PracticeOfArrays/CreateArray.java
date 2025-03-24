package PracticeOfArrays;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CreateArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*String[] array = new String[7];
        System.out.println("Lutfen 7 kelime giriniz: ");
        for (int i = 0; i < 7; i++) {
            System.out.print((i + 1) + ". kelime: ");
            array[i] = scanner.nextLine();
        }
        // Array'i ArrayList'e çevirme
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));

        System.out.println("ArrayList: " + arrayList);
*/

        ArrayList<String> yeniListe = new ArrayList<>();

        while (true) {
            System.out.println("Lutfen kac kelime gireceginiz belirtiniz (Donguyu sonlandirmak icin 0 giriniz.): ");
            int kelimeSayisi = scanner.nextInt();
            scanner.nextLine(); // nextInt sonrası tampon temizleme

            if (kelimeSayisi == 0) {
                System.out.println("Program sonlandiriliyor. ");
                break;
            }
            for (int i = 0; i < kelimeSayisi; i++) {
                System.out.println((i + 1) + ". kelimeyi giriniz: ");
                String kelime = scanner.nextLine();
                yeniListe.add(kelime);
            }
            System.out.println("Güncellenmis Liste: " + yeniListe);
            System.out.println("--------------------");
        }

        System.out.println("Silmek istediginiz elemani giriniz: ");
        String silinecekEleman = scanner.nextLine();

        if (yeniListe.remove(silinecekEleman)){
            System.out.println(silinecekEleman + " listeden kaldirildi.");
        }else {
            System.out.println(silinecekEleman + " listede bulunamadi.");
        }


    }
}
