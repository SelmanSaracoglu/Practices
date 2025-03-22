package FirstWeek;

import java.util.Scanner;

public class ConcatTwoOrMoreString {
    public static void main(String[] args) {
        /*
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your message: ");
        String message1= scan.nextLine();

        System.out.println("Please enter your 2. message: ");
        String message2= scan.nextLine();

        System.out.println(message1+ " " + message2);

        StringBuilder sonuc = new StringBuilder();
        sonuc.append(message1).append(" ").append(message2);
        System.out.println("Son hali: " + sonuc);

        scan.close();
 */

        Scanner scanner = new Scanner(System.in);
        // Kullanıcıya kaç kelime gireceğini soruyoruz
        System.out.println( "Please enter how much words do you want to concat: " );
        int numberOfWords = scanner.nextInt();
        scanner.nextLine(); // Bu satır, nextInt() sonrası kalan yeni satırı temizler.

        // StringBuilder nesnesi oluşturuyoruz
        StringBuilder newWord = new StringBuilder();

        // Döngü ile kullanıcıdan kelimeler alıyoruz
        for (int i = 0; i < numberOfWords; i++) {
            System.out.println("Girdi giriniz: ");
            String word = scanner.nextLine();

            // Kelimeyi StringBuilder'a ekliyoruz
            newWord.append(word).append(" "); // Kelimenin sonuna bir boşluk ekliyoruz
        }

        // Sonuç olarak tüm kelimeleri birleştiriyoruz ve ekrana yazdırıyoruz.
        System.out.println("Son hali: " + newWord);

    }
}
